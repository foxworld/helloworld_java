package kr.co.ksnet.foxworld.helloworld;

abstract class Info{
    public abstract int getLevel();
}
class EmployeeInfo1 extends Info{
    public int rank;
    EmployeeInfo1(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
 class Person1<T extends Info>{
    public T info;
    Person1(T info){ this.info = info; }
}

public class GenericDemo1 {

	public static void main(String[] args) {
        Person1<EmployeeInfo1> p1 = new Person1<EmployeeInfo1>(new EmployeeInfo1(1));
        //Person<String> p2 = new Person<String>("부장");
	
	}

}
