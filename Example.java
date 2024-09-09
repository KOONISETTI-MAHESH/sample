import java.util.*;
class ArithmeticOperatons{
    static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void subtract(int a,int b)
    {
        System.out.println(a-b);
    }
    void multiplication(int a,int b)
    {
        System.out.println(a*b);
    }
    void division(int a,int b)
    {
        System.out.println(a/b);
    }
}
public class Example{
    public static void main(String[] args)
    {
        ArithmeticOperatons ao=new ArithmeticOperatons();
        add(1,2);
        ao.subtract(1,2);
        ao.multiplication(1,4);
        ao.division(6, 7);
        Math.sqrt(9);

        }
}