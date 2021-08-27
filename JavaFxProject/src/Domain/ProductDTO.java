package Domain;

public class ProductDTO {

	private int pno;
	private String pname;
	private String pimage;
	private String pcontents;
	private String pcategory;
	private int pprice;
	private int pstock;
	private int pactivation;
	private int pquantity;

	// 생성자
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	// all field
	public ProductDTO(int pno, String pname, String pimage, String pcontents, String pcategory, int pprice, int pstock,
			int pactivation, int pquantity) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pimage = pimage;
		this.pcontents = pcontents;
		this.pcategory = pcategory;
		this.pprice = pprice;
		this.pstock = pstock;
		this.pactivation = pactivation;
		this.pquantity = pquantity;
	}

	public ProductDTO(String pname, String pimage, String pcontents, String pcategory, int pprice, int pstock,
			int pactivation) {
		super();
		this.pname = pname;
		this.pimage = pimage;
		this.pcontents = pcontents;
		this.pcategory = pcategory;
		this.pprice = pprice;
		this.pstock = pstock;
		this.pactivation = pactivation;
	}

	// getter, setter
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public String getPcontents() {
		return pcontents;
	}

	public void setPcontents(String pcontents) {
		this.pcontents = pcontents;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public int getPstock() {
		return pstock;
	}

	public void setPstock(int pstock) {
		this.pstock = pstock;
	}

	public int getPactivation() {
		return pactivation;
	}

	public void setPactivation(int pactivation) {
		this.pactivation = pactivation;
	}

	public int getPquantity() {
		return pquantity;
	}

	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}

}
