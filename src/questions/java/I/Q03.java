package questions.java.I;

public class Q03 {

	public static void main(String[] args) {
	try {
	    String[][] names = {{"Andre", "Mike"}, null, {"Pedro"}};
	    System.out.println(names[2][1].substring(0, 2));
	}
	catch (/* INSERT CODE HERE */) {
	    System.out.println(1);
	}
	
	//a IndexPositionException e
	//b NullPointerException e
	//c ArrayIndexOutOfBoundsException e 
	//d ArrayOutOfBoundsException e
	
	}
}
