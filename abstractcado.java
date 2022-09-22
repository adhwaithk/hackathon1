package agemarse;



abstract class animal{
	abstract void cat();
	abstract void dog();
}
class dog extends animal{
void cat() {}
void dog() {
	System.out.println("dogs bark");
}

}
class cat extends animal{
void cat() {
	System.out.println("cats meow");
}
void dog() {}
}

public class abstractcado {

	public static void main(String[] args) {
		dog obj=new dog();
		cat obj1=new cat();
		obj.dog();
		obj1.cat();
		

	}

}
