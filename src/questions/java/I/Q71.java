package questions.java.I;

class Paper {
	Paper() {
		this(10);
		System.out.println("Paper:0");
	}

	Paper(int a) {
		System.out.println("Paper:1");
	}
}

class PostIt extends Paper {
}

public class Q71 {
	public static void main(String[] args) {
		Paper paper = new PostIt();
	}
}
