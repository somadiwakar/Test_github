public class Example {
    //static variables
    static int a = 20;
    static int b = 30;
    //instance variables
    //instance variable requires new class or object
    int x=30;
    int y=40;
    public static void main(String[]args)
    {
        //local variables
        int q=10;
        int r=20;
        System.out.println("q:"+q);
        System.out.println("r:"+r);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        Example e=new Example();
        System.out.println("x:"+e.x);
        System.out.println("y:"+e.y);
    }
    
}
