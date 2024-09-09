import java.util.*;
public class Stringe {
    public static void main(String[] args)
    {
        char[] charArray={'h','e','l','l','o'};
        System.out.println(charArray);
        String s="hello";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        char[] charArrays=s.toCharArray();
        charArrays[5]='a';
        String x=new String(charArrays);
        System.out.println(x);
    }
}
