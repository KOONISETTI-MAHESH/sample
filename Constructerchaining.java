class Student{
    int age;
    String name;
    String branch;
    Student(int  age);
    {
        this.age=age;
    }
    Student(int age,String name)
    {
        this(age);
        this.name=name;
    }
    Student(int age,String name,String branch)
    {
        this(age,name);
        this.branch=branch;
    }
}
public class Constructerchaining {
    public static void main(String[] args)
    {
        Student s1=new Student(2);
        Student s2=new Student(2,"hai");
        Student s3=new Student(2,"hai","cse");
        s1.age;
        s2.name;
        s3.branch;
    }
}
