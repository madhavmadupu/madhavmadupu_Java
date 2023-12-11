package Week2;
import java.util.Scanner;

public class VolumeOfCuboid {
	int l,b,h;
	VolumeOfCuboid(int l,int b,int h){
		int result=l*b*h;
		System.out.println(result+" is the volume of cuboid");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length,breadth,height of cuboid:");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int height=sc.nextInt();
		VolumeOfCuboid v= new VolumeOfCuboid(length,breadth,height);
	}
}