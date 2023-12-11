package Week4;
import java.util.*;
class Animal{
	String s="";
}

class cat extends Animal{
	void shout()
	{
		String s="";
		System.out.println("cat makes");
		System.out.println(super.s);
		System.out.println(s);
	}
}
class dog extends Animal{
	void shout()
	{
		String s="nose";
		System.out.println("dog barks");
		System.out.println(super.s);
		System.out.println(s);
	}
}
public class Override_Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat obj=new cat();
		obj.shout();
	}
}