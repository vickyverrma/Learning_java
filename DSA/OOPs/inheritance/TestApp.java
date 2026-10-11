package OOPs.inheritance;
class humanSpecies{
    public String name;
    public int age;
    public String sex;
}
class student extends humanSpecies{
    public String Course;
    public int rollno;
    public String division;

    student(String name, int age,String sex,String Course,int rollno,String division)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.Course = Course;
        this.rollno = rollno;
        this.division = division;


    }
    public void display()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Sex is " + sex);
        System.out.println("Course is " + Course);
        System.out.println("Rollno is " + rollno);
        System.out.println("Division is " + division);
    }

}
public class TestApp {
    public static void main(String[] args) {
    student s1 = new student("Vicky" , 22,"Male" ,"B-tech",101,"First");
    s1.display();

    }
}
