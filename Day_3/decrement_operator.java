package Day_3;

public class decrement_operator {

	public static void main(String[] args) {
//++decrement operator
		
		//case 1
		
		int a=100;
		System.out.println(a);
		
		a--;   //a=a-1;
		System.out.println(a);
		
		
		
		//case 2 post increment 
		 int b=100;
		 int res=b--;		
         System.out.println(res);   //100
         System.out.println(b);     //99
         
         
       //case 3 pre increment 
		 int c=100;
		 int result=--c;		
         System.out.println(result);   //99
         System.out.println(c);     //99

	}

}
