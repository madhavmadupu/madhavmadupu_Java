package Tempo;
import java.util.*;
class VolumeCube {
	Scanner sc = new Scanner(System.in);
	void display(int r) {
	   double volume = Math.pow(r,3);
	  System.out.println("the volume of cube " + "" + volume);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		VolumeCube v1 = new VolumeCube();
		v1.display(r);
  }
}