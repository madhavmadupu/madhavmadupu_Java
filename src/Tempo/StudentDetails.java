package Tempo;
import java.util.*;
public class StudentDetails {
	
	String name;
	int id;
	
	void display(){
		System.out.print("name:"+name+"\nid:"+id);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDetails s1 = new StudentDetails();
		s1.name=sc.nextLine();
		s1.id=sc.nextInt();
		s1.display();
		sc.close();
	}
}
