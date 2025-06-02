package Day_5_loop_Statement;

public class palindrome_number {

	public static void main(String[] args) {
		
		// Reversing the number
		int num=121;
		int i=num, last_digit, palindrome=0, original=num;
		while(i>0)
		{
			last_digit=i%10;
			palindrome=palindrome*10 + last_digit;
			i=i/10;
			
		}
		
  
		// Checking if the original number is equal to its reverse
		if(palindrome==original)
		{
		   System.out.println(palindrome + " number is palindrome");
		}
		
		else
		{
			System.out.println(palindrome +" number is not palindrome");
		}

	}

}
