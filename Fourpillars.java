public class Example2{
    static bool prime(int a)
    {
        if()
    }
    static void printArrayElements(double arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void printArrayElements(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void printArrayElements(char arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr={10,20,30};
        double[] d={10.0,20.0,30.0};
        char[] c={'a','b','c','d'};
        String[] s={"hell0","all","this","xyz","java"};
        printArrayElements(arr);
        printArrayElements(d);
        printArrayElements(c);
        printArrayElements(s);
    }
}