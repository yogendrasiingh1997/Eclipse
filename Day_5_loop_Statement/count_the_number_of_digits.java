package Day_5_loop_Statement;

public class count_the_number_of_digits {

	public static void main(String[] args) {
		int i=9632587;
		int count=0;
		
		while(i>0)
		{
			i=i/10 ; //eliminate last digit
			count++;
		}
			
		System.out.println("total digot of number is:" + count);		


	}

	
}
