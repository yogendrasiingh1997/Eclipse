package Day_7;

import java.util.Arrays;
import java.util.Scanner;

public class Read_and_Write_data_into_array {

	public static void main(String[] args) {
		
		int a[]=new int [5];  //create empty array
		
		Scanner sc= new Scanner (System.in);

		for (int i=0;i<a.length;i++)
		{
			System.out.println("enter the number "+i+":");
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
