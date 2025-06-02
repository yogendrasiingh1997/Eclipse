package Day_13;

public class This_Keyword {
	
	int x,y; //class variable or instance variable
	
	/* Constructor
	 This_Keyword(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	*/
	
	
	//Method
	void setData(int y, int x)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) 
	{
		//This_Keyword th=new This_Keyword(10,20);
		This_Keyword th=new This_Keyword();
		
		th.setData(100, 200);
		th.display();

	}

}
