import java.util.Scanner;
import java.util.Arrays;
public class Multiarray {
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0][2]);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int r,c;
        Scanner read=new Scanner(System.in);
        r=read.nextInt();
        c=read.nextInt();
        int[][] mat =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=read.nextInt();
            }
        }
       /* for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }*/
        System.out.println(Arrays.deepToString(mat));
    }
}
