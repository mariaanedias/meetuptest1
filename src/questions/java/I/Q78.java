package questions.java.I;

class Book2 {
	private int pages = 100;
}

public class Q78 extends Book2 {
	private int interviews = 2;

	private int totalPages() {
		/* INSERT CODE HERE */
		//return super.pages + this.interviews*5;
		//return this.pages + this.interviews*5;
		//return super.pages + interviews*5;
		//return pages + this.interviews*5;
		//None of above
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(new Q78().totalPages());
	}
}
