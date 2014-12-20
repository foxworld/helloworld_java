package kr.co.ksnet.foxworld.helloworld;

class A {
	public int id;
	A(int id) {
		this.id = id;
	}
}

public class ReferenceDemo {

	public static void runValue() {
		String a = "abc";
		String b = a;
		b = "def";
		
		System.out.println("runValue= "+ a+ ", "+ a.length());
	}
	
	public static void runReference() {
		A a = new A(1);
		A b = a;
		b.id = 2;
		System.out.println("runReference="+ a.id + ", " + a);
	}

	public static void _reference1(A b) {
		b = new A(3);
	}
	
	public static void runReference1() {
		A a = new A(1);
		_reference1(a);
		System.out.println("runReference1="+ a.id + ", " + a);
	}

	public static void _reference2(A b) {
		b.id = 3;
	}
	
	public static void runReference2() {
		A a = new A(1);
		_reference2(a);
		System.out.println("runReference2="+ a.id + ", " + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue();
		runReference();
		runReference1();
		runReference2();
	}

}
