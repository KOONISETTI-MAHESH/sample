/*length of a Starightline
-----------------------------
Composition-Fundamental OOP concept.
-----------------------------
Where one class contains objects of other
class inside it as fields.
composition is also called as "has-a" relationship*/
import java.util.*;
class DateOfBirth{
    int day, month, year;
    DateOfBirth(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        return day+"-"+month+"-"+year;
    }
}
class Student{
    String name,branch;
    int age;
    DateOfBirth dob;
    void calculateAndPrintAge(){
        System.out.println(2024-dob.year);
    }
    Student(String name,String branch,DateOfBirth dob)
    {
        this.name=name;
        this.branch=branch;
        this.dob=dob;
    }
}
class Example7{
    public static void main(String[] args)
    {
        Student s1=new Student("h","cse",new DateOfBirth(17, 12, 2004));
        System.out.println(s1.dob);
        s1.calculateAndPrintAge();
    }
}