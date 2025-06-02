package Day_5_loop_Statement;

public class count_even_odd_digit_in_number {

	public static void main(String[] args) {
		
		int a=1111198781, even=0, odd=0;
		
		 while (a>0)
		{
			if (a%2==0)
			{
				even++;
			}
			
			else 
			{
				odd++;
			}
			
			a=a/10;
				
		}
		
		System.out.println("even number is " + even);
		System.out.println("odd number is " +odd);
		
		
		
		
		
		
	}

}
