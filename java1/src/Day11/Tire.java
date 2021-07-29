package Day11;

public class Tire {

	int tireLife;
	int numberOfTurns;
	String tirePosition;

	public Tire(String tirePosition, int tireLife) {
		super();
		this.tireLife = tireLife;
		this.tirePosition = tirePosition;
	}

	public boolean turn() {
		numberOfTurns++;
		
		if (numberOfTurns < tireLife) {
			System.out.println(tirePosition + " 타이어 수명 " + (tireLife-numberOfTurns) + " 남음");
			return true;
		} else {
			System.out.println(tirePosition + " 타이어 교체 요망");
			return false;
		}
	}

}
