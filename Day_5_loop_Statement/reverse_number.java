package Day_5_loop_Statement;

public class reverse_number {

	public static void main(String[] args) {
		int i=1234;
		 int reve=0, last_digit;
	      
		 
		 while(i>0)
		 {
			 last_digit=i%10;
			 reve=reve*10+ last_digit;
			 i=i/10;
			
			 
		 }
		 System.out.println(reve);
	}
	}

