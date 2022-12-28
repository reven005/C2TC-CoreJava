package day9;

public class AutoBoxing {

	public static void main(String[] args) {
		int a = 58;
		Integer d = a;						//autoboxing
		Integer b = Integer.valueOf(a);		//autoboxing
		Integer c = b;
		char e = 'a';
		Character f = Character.valueOf(e);
		Character g = e;
		System.out.println("int value is : "+a);
		System.out.println("Integer value is : "+b);
		System.out.println("char value is : "+e);
		System.out.println("Character value is : "+f);
	}

}
