package day8;

public class InstanceOf {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		InstanceOf c = null;
		InstanceOf i = new InstanceOf();		//object
		
		System.out.println(i instanceof InstanceOf);
		System.out.println(c instanceof InstanceOf);

	}

}
