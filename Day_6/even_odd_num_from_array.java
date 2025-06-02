package Day_6;

public class even_odd_num_from_array {

	public static void main(String[] args) {
		 
		int a[]= {12,7,9,1,10,5};
		int even=0;
		int odd=0;
		
		//for (int i=0; i<a.length; i++)
		{
		/*	if(a[i]%2==0)
			{
				//System.out.println("even number: "+ a[i]);

				even++;
			}
			
			else
			{
				//System.out.println("odd number: "+ a[i]);
				odd++;
			}
			
			
			
		}
		System.out.println(even);
		System.out.println(odd);
       */
		
	
			//print even or add number
		for (int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number: "+ a[i]);

			}
			
			else
			{
				System.out.println("odd number: "+ a[i]);
			
			}
	    }

}
		
}
	
}
	

