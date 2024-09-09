class Cat{
    String name;
    int age;
    Cat(){
        System.out.println("Hey you created a new instance of this class");
    }
    Cat(String n,int a){
          name = n;
          age  =a;
    }
    void p(){
        System.out.println(name);
        System.out.println(age);
    }
}
class Student1{
    String rollNumber, name, gender;
    int age, passOutyear;
    double cgpa;
    void setAllValues(String roll,String n,String g,int a,int p,double c){
        rollNumber=roll;
        name=n;
        gender=g;
        age=a;
        passOutyear=p;
        cgpa=c;
    }
    void printStudentDetails()
    {
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Pass out year: "+passOutyear);
        System.out.println("CGPA: "+cgpa);

    }
    public String toString(){
        return "Student("+name+","+age+")";
    }
}
class Rectangle1{
    int length,breadth;//Instance variables
    //Setter Method-used to set values to instantce variables
    //Mutator-->length
    void setLengthAndBreadth(int l,int b)
    {
        length = l;
        breadth = b;
    }
    void printAreaAndPerimeter(){
        System.out.println("Area is:"+(length*breadth));
        System.out.println("Perimeter is: "+(2*(length+breadth)));
    }
}
class BankAccount{
    int balanceAmount;
    BankAccount(){}
    BankAccount(int initialBalance){
        balanceAmount=initialBalance;
    }
}
/*Constructors
 * ---------
 * constructor is a special method
 * is used to construct an object  while
 * creating it.
 * is used to initialize istance variables with
 * values,while
 */
class Example4{
    public static void main(String[] args)
    {
        Rectangle1 r1=new Rectangle1();
        Rectangle1 r2=new Rectangle1();
        r1.setLengthAndBreadth(10,20);
        r2.setLengthAndBreadth(5,7);
        System.out.println(r1.length);
        r1.printAreaAndPerimeter();
        Student1 s1=new Student1();
        s1.setAllValues("23P31A0528","MAHESH","MALE",20,2027,7.5);
        s1.printStudentDetails();
        //instanceof->Whether an object is an instance of a particular class...
        System.out.println(r1 instanceof Rectangle1);
        System.out.println(r1 instanceof Object);
        System.out.println(r2 instanceof Rectangle1);
        System.out.println(s1);
        Cat c1=new Cat("Bob",6);
        Cat c2=new Cat("stella",7);
        Cat c3=new Cat("rock",6);
        Cat c4=new Cat();
        c1.p();
        System.out.println(c3.name);
        BankAccount account1 = new BankAccount(500);
        System.out.println(account1.balanceAmount);
        BankAccount account2=new BankAccount();
        System.out.println(account2.balanceAmount);
        Cat c4 = new Cat()
    }
}
