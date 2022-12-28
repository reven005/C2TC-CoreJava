package day9;

public class NormalClass extends AbstractClass1 {
	void hide() {						//overriding the abstract method
		System.out.println("Abstarct method 1");
	}
	void hide2() {
		System.out.println("Abstarct method 2");
	}

	public static void main(String[] args) {
		NormalClass n = new NormalClass();
		n.hide();
		n.hide2();
		n.show();

	}

}
