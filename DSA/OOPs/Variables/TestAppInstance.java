package OOPs.Variables;
class student{
    String name;
    int age;
//    constructor
    student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
//    instance method
    public void display()
    {
        System.out.println(name+ " " +age);
    }
}
public class TestAppInstance { // Instance variable takes memory in heap
    public static void main(String[] args) {
        student s1 = new student("vicky",22);
        s1.display();
    }
}
