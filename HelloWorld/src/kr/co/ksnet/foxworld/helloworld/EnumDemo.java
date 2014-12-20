package kr.co.ksnet.foxworld.helloworld;

//interface FruitInterface {
//	int APPLE = 1, PEACH = 2, BANANA = 3;
//}
//interface CompayInterface {
//	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//}

//class Fruit {
//	public static final Fruit APPLE = new Fruit();
//	public static final Fruit PEACH = new Fruit();
//	public static final Fruit BANANA = new Fruit();
//}
//class Company {
//public static final Company GOOGLE = new Company();
//public static final Company APPLE = new Company();
//public static final Company ORACLE = new Company();
//}

// enum 을 사용하면 switch 문 사용
// enum은 각 상수를 클래스화 해서 고유한 값으로 사용함
// enum은 클래스

enum Fruit {
	APPLE("RED"), PEACH("PINK"), BANANA("YELLOW");
	public String color;
	Fruit(String color) {
		this.color = color;
		System.out.println("Call Constructor "+this+"="+this.color);
	}
	public String getColor() {
		return color;
	}
}
enum Company {GOOGLE, APPLE, ORACLE }

public class EnumDemo {

	public static void main(String[] args) {
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f+", "+f.getColor());
		}
		
		Fruit type = Fruit.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(57+"kcal, color "+type.getColor());
				break;
			case PEACH:
				System.out.println(34+"kcal, color "+type.color);
				break;
			case BANANA:
				System.out.println(93+"kcal, color "+Fruit.BANANA.color);
				break;
		}

	}

}
