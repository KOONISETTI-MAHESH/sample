class Student2{
    String name,branch;
    int id;
    Student2(String name,String branch,int id)
    {
        this.name=name;
        this.branch=branch;
        this.id=id;
    }
    void printDetails(){
        System.out.println("Name: "+name+"\nBranch: "+branch+"ID: "+id);
    }
}
class Point1{
    int x,y;
    Point1(int x,int y)
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
public class Example6{
    static void printDistance(Point1 p1,Point1 p2){
       double distance = Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
       System.out.println(distance);
    }
    static void change(Point1 p)
    {
        p.x=100;
        p.y=200;
    }
    public static void main(String[] args){
        Point1 p1=new Point1(1,2);
        Point1 p2=new Point1(3,4);
        Student2 s=new Student2("mahesh","cse",26);
        s.printDetails();
        printDistance(p1,p2);
        change(p1);
        printDistance(p1,p2);

     }
}