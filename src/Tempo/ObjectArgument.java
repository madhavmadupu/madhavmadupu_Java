package Tempo;
import java.util.*;
public class ObjectArgument {
	String name;
	int id;
	void display(ObjectArgument O)
	{
		System.out.println("Name:" +name +"ID: "+id);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int id=sc.nextInt();
		ObjectArgument obj=new ObjectArgument();
		obj.id=id;
		obj.name=name;
	}
}