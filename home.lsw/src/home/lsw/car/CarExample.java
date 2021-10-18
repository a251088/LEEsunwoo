package home.lsw.car;

public class CarExample {
	public static void main(String[] args) {

		Car myCar1 = new Car();
		Car myCar2 = new Car("es300h");
		Car myCar3 = new Car("es300h", "sonicChrome");
		Car myCar4 = new Car("es300h", "sonicChrome", 180);

		System.out.println(myCar4.company+" " + myCar4.model+" " + myCar4.color+" " + myCar4.maxSpeed);
	}
}
