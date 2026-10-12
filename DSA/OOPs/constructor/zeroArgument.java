package OOPs.constructor;
class Student{
    String name;
    int age;
    Student()
    {
        System.out.println("Constructor has been called");
    }
    public void display(String name, int age)
    {
        System.out.println(name);
        System.out.println(age);

    }
}
public class zeroArgument {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.display("Vicky",22);
    }
}
