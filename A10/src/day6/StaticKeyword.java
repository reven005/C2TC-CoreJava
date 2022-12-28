package day6;

public class StaticKeyword {
	int rollno;
	String name;
	static String college="MIT";
	StaticKeyword(int r, String n){
		rollno = r;
		name = n;
	}
	void display(){
		System.out.println("Roll no is :"+rollno);
		System.out.println("Name is :"+name);
		System.out.println("College name is :"+college);

	}
	static void d() {
		
	}
	static {
		System.out.println("I am a Static block");
	}

	public static void main(String[] args) {
		StaticKeyword s1 = new StaticKeyword(111, "Reven");
		StaticKeyword s2 = new StaticKeyword(112, "Jana");
		StaticKeyword s3 = new StaticKeyword(113, "Jack");
		s1.display();
		s2.display();
		s3.display();
		System.out.println();
		StaticKeyword.d();

	}

}
