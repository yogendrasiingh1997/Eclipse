package Day_7;

public class search_element_in_array {

	public static void main(String[] args) {
		
		
		int a[]= {10,12,14,20,30,42};
		int search_element=10;
		boolean status=false ; // false- not found true- found
		
		/* for (int i=0; i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("element found");
				status=true;
				break;
			}
				
		}
		
		if(status==false)
		{
			System.out.println("element not found");
		}
*/
	
	for(int x:a)
	{
 		if(x==search_element)
		{
			System.out.println("element found");
			status=true;
			break;
		}
			
	}
	
	if(status==false)
	{
		System.out.println("element not found");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
