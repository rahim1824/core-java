class subClass
{
    String msg="Hello Welcome to Classes";
    void disp()
    {
        System.out.println(msg);
    }
}
class MainClass
{
    public static void main(String args[])
    {
        subClass sc=new subClass();
        sc.disp();
    }
}