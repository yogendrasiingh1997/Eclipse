package Day_5_loop_Statement;

public class sum_of_digits {

	public static void main(String[] args) {
		 int i=96854;
		 int sum=0;
		 
		 while(i>0)
		 {
			 int temp =i%10 ;// taking last digit
			
			  sum=	temp+sum;
			  
			  i=i/10;   //eliminate the last digit	  
					  
		 }
		 
		 System.out.println(sum);

	}

	}


