import javax.swing.JOptionPane;
class Point{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
        showPoint(x,y);
    }
    void showPoint(int a,int b)
    {
        System.out.println("value of x:"+a+",value of y:"+b);
    }
}
class Employee{
    int id,salary;
    String name;
    Employee(){
        name=JOptionPane.showInputDialog("Enter your name: ");
        id=Integer.parseInt(JOptionPane.showInputDialog("Enter your id: "));
        salary=Integer.parseInt(JOptionPane.showInputDialog("Enter your salary: "));
        showDetails();
    }
    void showDetails(){
        String outputString="ID: "+id+"\nName: "+name+"\nSalary: "+salary;
        JOptionPane.showMessageDialog(null,outputString);
    }
}
class Example5
{
    public static void main(String[] args)
    {
        // String name =JOptionPane.showInputDialog("Enter your name");
        // String outputString="hello, "+name;
        // JOptionPane.showMessageDialog(null,outputString);
        // System.out.println("Hello, "+name);
       // Employee e1=new Employee();
        //e1.showDetails();
        //Employee e2=new Employee();
       // e2.showDetails();
        Point d=new Point(10,30);
        //this keyword in java
        //1.this keyword in java represents the current object
        //2.this keywords has several uses in java
           // I.Used to access instance members of the class within the class
           // II.Used to distinguish instance variables and local variables
           // III.Used d
    
    }
}