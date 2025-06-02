package Day_13;

public class Static_Demo {
	
	static int a=10; //static variable
	int b=20;        //non static variable
	
	static void m1()  //static method
	{
		System.out.println("this is m1 static variable");
	}

	void m2()  //non static method
	{
		System.out.println("this is m2 non static variable");
	}
	  
	void m()  //non static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	public static void main(String[] args) 
	{
		
		//1 Static method can access directly static stuff
		
		System.out.println(a);
		m1();
		
		//2 Static method can access directly non static with object
		
		Static_Demo s=new Static_Demo();
		System.out.println(s.b);
		s.m2();
		
		
		//3non static method can access everything directly 
		
		s.m();
		
	}

	
	
	
	
}
