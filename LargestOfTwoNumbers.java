import java.util.Scanner;
public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
