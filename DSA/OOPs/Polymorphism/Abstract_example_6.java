package OOPs.Polymorphism;

abstract class Person {
     String name;
     int age;
     int height;
//     Why we need constructor in abstract class, when we can't instantiate an object?
//Ans. To get the properties of parent class to child class, we need constructors in
//abstract class also.
    Person(String name, int age, int height)
    {
        this.name = name;
         this.age = age;
         this.height = height;

    }
}
class student extends Person {
    int marks;
    int avg;
    student(String name, int age, int height,int marks,int avg)
    {
//        To call parametrized constructor of parent from child class
        super(name,age,height);
        this.marks = marks;
        this.avg = avg;
    }
    public void display()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Height is " + height);
        System.out.println("Marks is " + marks);
        System.out.println("Avg is " + avg);
    }
}
public class Abstract_example_6 {
    public static void main(String[] args) {
//        Person p = new Person("Vicky",22,160);
        student s = new student("Vicky",22,160,342,80);
        s.display();
    }
}
