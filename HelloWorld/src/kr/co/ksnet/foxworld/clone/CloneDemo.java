package kr.co.ksnet.foxworld.clone;

class Student implements Cloneable{
	String name;
	Student(String name) {
		this.name = name;
	}
	
	//clone은 protected 이므로 overriding 하여 사용
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneDemo {

	public static void main(String[] args) {
		Student s1 = new Student("foxworld");
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
