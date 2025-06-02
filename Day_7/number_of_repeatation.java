package Day_7;

public class number_of_repeatation {

	public static void main(String[] args) {
		int a[]= {10,12,14,20,30,42,10,10};
		int search_element=10;
		int count=0;
		
		for(int value:a)
		{
			if(value==search_element)
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		

	}

}
