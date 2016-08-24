package questions.java.I;

class Printer {
    int inkLevel;
}

class LaserPrinter extends Printer {
    int pagesPerMin;
    public static void print() {
        Printer myPrinter = new LaserPrinter();
        System.out.println(/* INSERT CODE HERE */);
        
        //(LaserPrinter)myPrinter.pagesPerMin
        //myPrinter.pagesPerMin
        //LaserPrinter.myPrinter.pagesPerMin
        //((LaserPrinter)myPrinter).pagesPerMin
    }
}

public class Q15 {
	public static void main(String[] args) {
		LaserPrinter.print();
	}
}
