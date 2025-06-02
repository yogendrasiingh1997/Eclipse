package Day_3;

public class swapping_two_numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("before swapping value of a is " +a);
		System.out.println("before swapping value of b is " +b);
		
		a=a+b; //30
		b=a-b; //b=10
		a=a-b; //a=20
		
		
		
		/*System.out.println("after swapping value of a is " +(a+b-a));
		System.out.println("after swapping value of b is " +(a+b-b));*/
		
		System.out.println("after swapping value of a is " +a);
		System.out.println("after swapping value of b is " +b);
	}

}
