package oops.inheriacne;

class Rbi {

	public int tax = 15000;

}

class Bank extends Rbi {

	public float intRate = 15.52f;

	public void branch() {

		System.out.println("Bank branch called,..");
		System.out.println("tx from rbi for bank =" + tax);
	}

}

public class SBI extends Bank {

	public void demo() {

		System.out.println("tx from rbi for bank =" + tax);
		System.out.println(intRate);
	}

	public static void main(String[] args) {

		SBI s = new SBI();
		s.branch();
		s.demo();
	}
}
