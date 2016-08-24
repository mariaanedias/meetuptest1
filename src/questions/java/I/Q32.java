package questions.java.I;

class Season {
	String name;
}

public class Q32 {
	public static void main(String arguments[]) {
		Season season1 = new Season();
		season1.name = "Spring";
		Season season2 = new Season();
		season2.name = "Autumn";
		season1 = season2;
		System.out.println(season1.name);
		System.out.println(season2.name);
	}
}
