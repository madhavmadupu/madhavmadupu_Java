package Week5;
import java.util.*;

public class BubbleSort{
	public static void main(String args[]){
		int[] arr= {8, 3, 6, 9, 2, 1};
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<(arr.length-1); i++) {
				int temp;
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for (int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}