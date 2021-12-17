package Day8;

import Day10.test;

public class Test {
	public static void parent(Object o) {
		System.out.println("Parent");
	}
	void check() {
		System.out.println("check");
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] chars) throws Throwable {
		parent(null);
		Test t= new Test();
		
		t.finalize();
	}
	

}
