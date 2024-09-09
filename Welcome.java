import java.util.Scanner;
class Demo
{
    public static void main(String[] args)
    {
      System.out.println("Welcome All to java");
      int a,b,c;
      Scanner read=new Scanner(System.in);
      a=read.nextInt();
      b=read.nextInt();
      c=a+b;
      System.out.println(a+""+b+""+c);
      System.out.println(c);
      System.out.println("Sum of"+a+"and"+b+"is:"+c);
      System.out.printf("sum of %d and %d is %d:",a,b,c);
    }
}