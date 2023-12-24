package Week4;
public class Final{
	final int constVal = 10;
	
	Final(){
		System.out.println("Final main Method");
	}
	
	final void finalmethod() {
		System.out.println("final method");
	}
}

class SubClass extends Final{
	public static void main(String args[]) {
		Final obj=new Final();
		obj.finalmethod();
	}
}