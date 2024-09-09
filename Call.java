import java.util.Arrays;
class Call{
    static void change(int[] a){
        a[0]=1000;
    }
    public static void main(String[] args)
    {
        int[] a={10,20,30,40};
        System.out.println("Before changing: "+Arrays.toString(a));
        change(a);
        System.out.println("After changing: "+ Arrays.toString(a));
        int[][] arr={{10,20},{20,30,40,60},{10,40,60,32},{1,2,3,2,1,4,3}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {   
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
        int[][] b=new int[3][];
        b[0]=new int[10];
        b[1]=new int[20];
        b[2]=new int[1];
        for(int i=0;i<10;i++){
            b[0][i]=i*i;
        }
        System.out.println(Arrays.deepToString(b));
        /*
         * int[][] a=new int[3][];
         * int[][][] b=new int[3][][];
         * b[0]=new int[4][5];
         * b[1]=new int[2][3];
         * b[2]=new int[1][1];
         */
    }
}