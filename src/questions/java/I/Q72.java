package questions.java.I;

public class Q72 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("eLion");
		String ejg = null;
		ejg = sb1.append("X").substring(sb1.indexOf("L"), sb1.indexOf("X"));
		System.out.println(ejg);
	}
}
