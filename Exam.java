import java.util.Scanner;
class Exam{
    static void sayHello(){//static method
        System.out.println("Hello");
    }
    void sayHai()
    {
        System.out.println("hai");
    }
    public static void main(String[] args)
    {
        sayHello();
        sayHello();
        Exam e1=new Exam();
        e1.sayHai();
    }
}