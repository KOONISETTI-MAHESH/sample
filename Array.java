import java.util.Arrays;
class Array{
    public static void main(String[] args)
    {
        int[] array=new int[]{10,20,30};
        for(int each:array)
        System.out.println(each);
        Arrays.toString(array);
        System.out.println(Arrays.toString(array));
    }
}