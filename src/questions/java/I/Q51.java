package questions.java.I;

class Fish {
	static byte count;
}

public class Q51 {
	public static void main(String args[]) {
		boolean hungry = false;
		while (hungry = true) {
			++Fish.count;
		}
		System.out.println(Fish.count);
	}
}
