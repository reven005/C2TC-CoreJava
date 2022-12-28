package day8;

public class MethodOverloading1 {
	void a() {
		System.out.println("Normal method");
	}
	void a(int a) {
		System.out.println("Single integer method");
		System.out.println("Integer is : "+a);
	}
	void a(int b, int c) {
		System.out.println("Double integer method");
		System.out.println("Integer is : "+b);
		System.out.println("Integer is : "+c);
	}
	void a(char a) {
		System.out.println("Single Character method");
		System.out.println("Character is : "+a);
	}
	void a(char a, int b) {
		System.out.println("Character & Integer method");
		System.out.println("Character is : "+a);
		System.out.println("Integer is : "+b);
	}
	void a(int a, char b) {
		System.out.println("Integer & Character method");
		System.out.println("Integer is : "+a);
		System.out.println("Character is : "+b);
	}
	public static void main(String[] args) {
		MethodOverloading1 mo = new MethodOverloading1();
		mo.a();
		mo.a(5);
		mo.a(5, 3);
		mo.a('a');
		mo.a('b', 123);
		mo.a(234, 'd');
		

	}

}
