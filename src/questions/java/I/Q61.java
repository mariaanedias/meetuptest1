package questions.java.I;

class Phone1 {
	void call() {
		System.out.println("Call-Phone");
	}
}

class SmartPhone1 extends Phone1 {
	void call() {
		System.out.println("Call-SmartPhone");
	}
}

public class Q61 {
	public static void main(String[] args) {
		Phone1 phone = new Phone1();
		Phone1 smartPhone = new SmartPhone1();
		phone.call();
		smartPhone.call();
	}
}
