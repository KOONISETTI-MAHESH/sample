import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int a=10;
        int b=20;
        int max=a>b?a:b;
        System.out.println(max);
        System.out.println(a>b?a:b);
        System.out.println(a%2==0?"Even":"Odd");
        String result=a%2==0?"Even":"Odd";
        System.out.println(result);
        int x=10,y=20,z=30;
        System.out.println((x>y&&x>z)?x:(y>z&&y>x)?y:z);
    }
}
