package day6;

public class Abstract2 extends Abstract {
	
	void a() {
		System.out.println("Method A");
	}

	void b() {
		System.out.println("Method B");
	}
	public static void main(String[] args) {
		Abstract2 obj = new Abstract2();
		obj.a();
		obj.b();
		obj.c();
		obj.c();

	}

}
