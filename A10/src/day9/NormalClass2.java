package day9;

public class NormalClass2 implements Interface1, Interface2 {
	public void hide1() {
		System.out.println("Method hide 1");
	}
	public void hide2() {
		System.out.println("Method hide 2");
	}
	public void hide3() {
		System.out.println("Method hide 3");
	}

	public static void main(String[] args) {
		NormalClass2 n = new NormalClass2();
		n.hide1();
		n.hide2();
		n.hide3();
		

	}

}
