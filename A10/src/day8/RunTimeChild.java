package day8;

public class RunTimeChild extends RunTime{
	void a() {
		System.out.println("Method A of Child");
	}
	void b() {
		System.out.println("Method B of Child");
	}

	public static void main(String[] args) {
		RunTime r = new RunTimeChild();				//Upcasting
		r.a();
		r.b();

	}

}
