package questions.java.I;

class Phone {
	static void call() {
		System.out.println("Call-Phone");
	}
}

class SmartPhone extends Phone {
	static void call() {
		System.out.println("Call-SmartPhone");
	}
}

public class Q38 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Phone smartPhone = new SmartPhone();
		phone.call();
		smartPhone.call();
	}
}
