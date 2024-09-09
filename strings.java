import java.util.Scanner;
class StringExample{
            public static void main(String[] args)
           { 
             //An object of Scanner class
             Scanner read=new Scanner(System.in);
             //Reading a single character
             char ch=read.next().charAt(0);  
             //String name=read.nextLine();
             System.out.println("character "+ch);
           }
}