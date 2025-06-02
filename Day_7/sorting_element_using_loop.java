package Day_7;

import java.util.Arrays;

public class sorting_element_using_loop {

	public static void main(String[] args) {
		
		int a[]= {10,50,20,30,40};
		
		System.out.println("before sorting: "+ Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			Arrays.sort(a);
		}
         
		System.out.println("after sorting: "+ Arrays.toString(a));
	}

}
