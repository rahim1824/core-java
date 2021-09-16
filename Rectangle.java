class Rectangle
{
    int length;
    int breath;
    void setval(int l,int b)
    {
        length=l;
        breath=b;
    }
    int area()
    {
        int ar;
        ar=length*breath;
        return ar;
    }
	public static void main(String args[]) 
	{
	    Rectangle frect = new Rectangle();
		frect.setval(6,8);
		int area=frect.area();
                System.out.println("Area is:"+area);
	}
}

    
 
 