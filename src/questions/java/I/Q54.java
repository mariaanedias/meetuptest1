package questions.java.I;

class Book1 {
	String ISBN;

	Book1(String val) {
		ISBN = val;
	}

	public boolean equals(Object b) {
		if (b instanceof Book1) {
			return ((Book1) b).ISBN.equals(ISBN);
		} else
			return false;
	}
}

public class Q54 {
	public static void main(String args[]) {
		Book1 b1 = new Book1("1234-4657");
		Book1 b2 = new Book1("1234-4657");
		System.out.print(b1.equals(b2) + ":");
		System.out.print(b1 == b2);
	}
}
