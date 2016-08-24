package questions.java.I;

class MyExam {
	void question() {
		try {
			question();
		} catch (StackOverflowError e) {
			System.out.println("caught");
		}
	}
}

public class Q39 {
	public static void main(String args[]) {
		new MyExam().question();
	}
}
