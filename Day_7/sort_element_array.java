package Day_7;

import java.util.Arrays;

public class sort_element_array {

	public static void main(String[] args) {

		int a[]= {100,600,300,700,900,120};
		System.out.println("before sorting");
		
		System.out.println(Arrays.toString(a));  //single statement for print array
		
		/*for(int value:a)
		{
			System.out.println(value);
		} */
		
		Arrays.sort(a);  //sort element in array

        System.out.println("after sorting");
		
		System.out.println(Arrays.toString(a));  //single statement for print array
	}

}
