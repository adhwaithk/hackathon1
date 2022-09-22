package agemarse;
abstract class Bank{
	abstract int getbalance();
}
class A extends Bank{

	int getbalance() {
		System.out.println("$100");
		return 0;
	}
}
class B extends Bank{

	int getbalance() {
		System.out.println("$150");
		return 0;
	}
}
class C extends Bank{

	int getbalance() {
		System.out.println("$200");
		return 0;
	}
}


public class abstractbank {

	public void main(String[] args) {
		A obj=new A();
		B obj1=new B();
		C obj2=new C();
		obj.getbalance();
		obj1.getbalance();
		obj2.getbalance();

	}

}
