package Day_13;

public class Static_Main {

	public static void main(String[] args) {
		{
			
			//1 Static method can access directly static stuff
			
			System.out.println(Static_Demo.a);
			Static_Demo.m1();
			
			//2 Static method can access directly non static with object
			
			Static_Demo s1=new Static_Demo();
			System.out.println(s1.b);
			s1.m2();
			
			
			//3non static method can access everything directly 
			
			s1.m();
			
		}
	}

}
