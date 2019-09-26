package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] foods = {"Oranges", "Hot Dogs", "Pasta", "Ice Cream"};
		int [] numbers = {12, 10, 4, 3};
		//2. print the third element in the array
		System.out.println(foods[3]);
		//3. set the third element to a different value
		int [] newfoods = new int [3];
		//4. print the third element again
		System.out.println(foods[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<foods.length;i++) {
			System.out.println(foods[3]);
		}
		
		//6. make an array of 50 integers
		int nums[] = new int[50];
			 
		
		//7. use a for loop to make every value of the integer array a random number
		Random rnd =  new Random();
		for (int i = 0; i < nums.length;i++) {
			nums[i] = rnd.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int min = 50;
		int max = 0;
		for(int i = 0; i < nums.length; i++) { 
			if (nums[i]<min) min = nums[i];
			if (nums[i] > max) max = nums[i]; 
			
			}
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < nums.length;i++) {
			System.out.println( nums[i] + " ");
		}
		//10. print the largest number in the array.
	System.out.println(" The largest number is:" + max);
		}
		
}
