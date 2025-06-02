package Day_12;

public class box 
{

         double width,height,depth;
         
         box()
         {
        	 width=0;
        	 height=0;
        	 depth=0;
        	 
        	 //width=height=depth=0;
         }
         
         
         box(double w, double h, double  d)
         {
        	width=w;
        	height=h;
        	depth=d;
         }
         
         box(double len)
         {
        	 width=height=depth=len;
         }

	
         double volume()
         {
        	return( width*height*depth);

        
        	
         }
	
	
	
	
}
