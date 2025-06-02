package Day_6;

public class Single_dimentional_array {

	public static void main(String[] args) {
		 
		
		//declare the array
		
		//Approach 1
		 
		int a[]= new int [5];
		
		//add values in array
		
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a[1]); //read single value from array
		*/
		
		//Approach 2
		
		int b[]= {100,200,300,400,500,600,700};
		
		/*System.out.println(b[4]); //read single value from array
		
		
		//length of an array
		
		System.out.println(a.length);
		System.out.println(b.length);
*/
		
		//reading all the value form array
		//Normal for loop
		
		/*
		  for (int i=0; i<b.length;i++) //i<=4  i<5  i<b.lenght  i<=b.length-1
		 
		{
			System.out.println(b[i]);
		}
		*/
		
		
		//enhanced for loop
		
		for(int x:b)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
