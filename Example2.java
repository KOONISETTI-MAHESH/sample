public class Example2
{
    public static void main(String[] args)
    {
        String s1="123";
        int num=Integer.parseInt(s1);
        System.out.println(num);
        int bS=123;
        String num2=Integer.toString(bS,2);
        System.out.println(num2);
        String oS="127";
        int num3=Integer.parseInt(oS,8);
        System.out.println(num3);
        String hS="ABCD";
        int num4=Integer.parseInt(hS,16);
        System.out.println(num4);
        int num7=14;
        String s3=Integer.toString(num7);
        System.out.println(s3);
        System.out.println(s3.charAt(1));
        num2="123-34-56";
        String[] arri=num2.split("-",3);
        String you=Integer.toString(Integer.parseInt(arri[0]),2)+"-"+Integer.toString(Integer.parseInt(arri[1]),2)+"-"+Integer.toString(Integer.parseInt(arri[2]),2);
        System.out.println(you);
    }
}