package OOPs.constructor;
class Student1{
    String name;
    int age;
    Student1()
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
    Student1 s1 = new Student1();
    s1.display("Vicky",22);
    }
}
