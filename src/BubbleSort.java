import java.util.*;
public class BubbleSort {

	public static void main(String args[]) throws java.io.IOException{
		
		Scanner scn = new Scanner(System.in);
		int nums[] = new int [10];
		
		for(int i = 0; i < nums.length; i++){
			System.out.print("Enter an integer: ");
			nums[i] = scn.nextInt();
		}
		
		System.out.println("Original array: ");
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i] + " ");
		}
		
		System.out.println();
		
		int tmp; //temporary variable
		
		/*Bubble Sort*/
		for(int a = 1; a < nums.length; a++)
			for(int b = nums.length - 1; b >= 1; b--)
				if(nums[b-1] > nums[b]){
					//exchange elements
					tmp = nums[b-1]; 
					nums[b-1] = nums[b];
					nums[b] = tmp;
				}
		
		System.out.println();
		System.out.println("\nSorted array;");
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
	}
}
