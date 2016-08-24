package questions.java.I;

class Laptop1 {
	String memory = "1GB";
}

public class Q68 {
	public static void main(String args[]) {
		Laptop1 life = new Laptop1();
		repair(life);
		System.out.println(life.memory);
	}

	public static void repair(Laptop1 laptop) {
		laptop = new Laptop1();
		laptop.memory = "2GB";
	}
}
