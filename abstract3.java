package agemarse;



abstract class parent{
	void message() {
		
	}
}
class subclass1 extends parent{
	void message() {
		System.out.println("this is first subclass");
	}
}
class subclass2 extends parent{
	void message() {
		System.out.println("this is second subclass");
	}
}

public class abstract3 {

	public static void main(String[] args) {
		subclass1 s1=new subclass1();
		subclass2 s2=new subclass2();
		s1.message();
		s2.message();
		

	}

}
