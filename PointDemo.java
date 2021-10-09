class point 
{
    
     private int x;
     private int y;
    
     public void setX(int X)
     {

	x = (x > 79 ? 79 : (x < 0 ? 0 :x));
     }
   
     public void setY(int y)
     {
    
        y = (y > 24 ? 24 : (x < 0 ? 0 :y));
     }
   
     public int getX()
     {
	return x;
     }
   
     public int getY()
     {
	return y;
     }

}
class PointDemo

{
    
 	public static void main(String args[])
    
	{
       
		point p1 = new point();
        
		p1.setX=(-22);
       
		p1.setY=(144);
        
		System.out.println("The value of x is "+p1.getX());
       
		System.out.println("The value of y is "+p1.getY());
    	
	}

}