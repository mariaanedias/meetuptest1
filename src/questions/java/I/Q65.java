package questions.java.I;

class Diary {
	int pageCount = 100;

	int getPageCount() {
		return pageCount;
	}

	void setPageCount(int val) {
		pageCount = val;
	}
}

public class Q65 {
	public static void main(String args[]) {
		System.out.println(new Diary().getPageCount());
		new Diary().setPageCount(200);
		System.out.println(new Diary().getPageCount());
	}
}
