package Day_5_loop_Statement;

public class while_loop {

	public static void main(String[] args) {

		//example 1
		/*
		int i=1; //initialization
		
		while (i<=10)  // condition
		{
			System.out.println(i);
			i++;  //inc
		}
		*/
		
		//example 2
		
     /*
		int i=1; //initialization
		
		while (i<=10)  // condition
		{
			System.out.println("hello");
			i++;  //inc
		}
	*/
		
	//even number using while if loop	
		
		/*
		  int i=1;
		
		while (i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
			i++;
		}
		*/
		
		
		//even no only using while
		
		/*
		int i=2;
		 while(i<=10)
		 {
			 System.out.println(i);
			 i+=2;   //i=i+2
		 }
		*/
		
	//Example 4
		
		int i=1;
		while (i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i +  "Even");
			}
			else
				System.out.println(i +  "odd");
			i++;
		}

	}

}
