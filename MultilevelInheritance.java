class Person{
    String name;
    int age;
}
class Student extends Person{
    String id;
    String branch;
    String college;
}
class Intern extends Student{
    String internId;
    double salary;
}
public class MultilevelInheritance {
    public static void main(String[] args)
    {
        Intern i1=new Intern();
        i1.name="mahesh";
        System.out.println(i1.name);
    }
}
