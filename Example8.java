/*Inheritance
 A process of one class acquiring properties of another.
 -In java, we use extends keyword to perform in heritance
 -class Student extends Person
         Student            Person
         Child class        Parent class
         Sub class          Super class
         Derived class      Base class
 Inheritance is called as "is-a" relationshp.
 Every student is a person
 Every trainder is a person
 ==================================
 Types of Inheritance:
 ---------------------------
 1. Single inheritance
 One parent ->One child class
 2.Hierarchical Inheritance
 One parent->Multiple child classes
 3.Multi-level Inheritance
 Grand Parent->Parent ->child
 4.Hybrid Inheritance
 5.Multiple Inheritance
   More than one parent class ->one child class
       JAVA DOESN'T SUPPORT MULTIPLE INHERITANCE>
       
 */
class Person{
    String name;
    int age;
    void introduce(){
        System.out.println("Hi,I am "+name+", "+age+" years old.");
    }
}
class Student extends Person{
  String sId;
}
class Trainer extends Person{

}
public class Example8 {
   public static void main(String[] args)
   {
    Student s1=new Student();
    Trainer t1=new Trainer();
    Person p1=new Person();
    s1.name="abc";
    s1.age=17;
    System.out.println(s1.name);
    s1.introduce();
    System.out.println(p1 instanceof Person);
    System.out.println(s1 instanceof Person);
    System.out.println(t1 instanceof Person);
   }
 
}
