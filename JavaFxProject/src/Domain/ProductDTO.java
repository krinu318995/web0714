package Domain;

public class ProductDTO {

	private int pno;
	private String pname;
	private String pimage;
	private String pcontents;
	private int pprice;
	private int pstock;
	private int pactivation;
	private int pquantity;

	public ProductDTO() {
		// 기본 생성자
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
