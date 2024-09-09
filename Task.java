import java.util.*;
public class Task {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        String[] A=new String[t]; //new is used to provide memory for t elements
        for(int i=0;i<t;i++)
        {
            A[i]=sc.next();
        }
        for(int i=t-1;i>=0;i--)
        {
            System.out.println(A[i].charAt(0)+"->"+(int)A[i].charAt(0));
        }
        for(String eachElement:A)
        {
            System.out.println(eachElement);
        }
    }
}
