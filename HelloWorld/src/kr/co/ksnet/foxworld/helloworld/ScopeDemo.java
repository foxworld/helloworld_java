package kr.co.ksnet.foxworld.helloworld;

public class ScopeDemo {
	static  int i = 0;
	
	static void a() {
		int i = 0;
		System.out.println(i);
	}
	public static void main(String[] args) {
		for(i=0; i < 5; i++) {
			a();
			System.out.println(i);
		}
		System.out.println("한글은 잘 입력이 되나?");
	}

}
