package kr.co.ksnet.foxworld.object;

class Student {
	String name;
	Student(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Student _obj = (Student) obj;
		return _obj.name == this.name;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("foxworld");
		Student s2 = new Student("foxworld");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
