package questions.java.I;

import java.util.*;

class Person2 {
}

class Emp2 extends Person2 {
}

public class Q88 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new String("1234"));
		list.add(new Person2());
		list.add(new Emp2());
		list.add(new String[] { "abcd", "xyz" });// LINE4
	}
}
