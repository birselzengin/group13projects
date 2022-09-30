package projects;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		   System.out.println("Please Enter the size of the array");
		   int size = scanner.nextInt();
		   int[] arr = new int[size];


		   for(int i=0;i<size;i++) {
		       System.out.println("Please Enter an int number");
		       arr[i]=scanner.nextInt();

		   }
		   System.out.println(Arrays.toString(arr));
		   int sum=0;
		   for(int num:arr) {
		       sum+=num;
		   }

		   System.out.println("Sum of all the numbers from the Array is "+sum);








		    }

		

	}


