// class Rectangle{
//     int length;
//     int width;
//     void calculateAndPrintArea()
//     {
//         System.out.println(length*width);
//     }
//     void calculateAndPrintPerim()
//     {
//         System.out.println(2*(length+width));
//     }
// }
class Student{
    String name;
    int age;
    int[] Marks;
    int totalMarks;
    float percentage;
    void calculateTotal(){
        int sum=0;
        for(int i=0;i<Marks.length;i++)
        sum+=Marks[i];
        totalMarks=sum;
    }
    void calculatePerc()
    {
        percentage=totalMarks/6;
    }
    void PrintStudentDetails(){
        System.out.println(name+" "+age+" "+totalMarks+" "+percentage);
    }
    void printDetails()
    {
        System.out.println(name+" "+age);
    }
}
class Example3{
    public static void main(String[] args)
    {
       //object of the class
       //Classname object_name= new Classname() 
       Student s1=new Student();
       s1.name="mahesh";
       s1.age=20;
       Student s2=new Student();
       s2.name="umar";
       s2.age=30;
       System.out.println(s1.name+" "+s1.age);
       System.out.println(s2.name+" "+s2.age);
       s1.Marks=new int[]{10,20,30,40,50};
       s1.PrintStudentDetails();
       s1.printDetails();
    //    Rectangle r1=new Rectangle();
    //    Rectangle r2=new Rectangle();
    //    r1.length=30;
    //    r1.width=10;
    //    r2.length=40;
    //    r2.length=20;
    //    r1.calculateAndPrintArea();
    //    r2.calculateAndPrintArea();
    //    r1.calculateAndPrintPerim();
    //    r2.calculateAndPrintPerim();

    }
}