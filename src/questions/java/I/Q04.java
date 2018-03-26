package questions.java.I;

public class Q04 {
	public static void main(String[] args) {
		int a = 10;
		String name = null;
		try {
			a = name.length();
			a++;
		} catch (RuntimeException e) {
			e.printStackTrace();
			++a;
		}
		System.out.println(a);
		
		// a5
		// b6
		// c 10
		// d 11
		// e 12
		// f Runtime exception
	}
}
