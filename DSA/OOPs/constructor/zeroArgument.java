package OOPs.constructor;
class student{
    String name;
    int age;
    student()
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
    student s1 = new student();
    s1.display("Vicky",22);
    }
}
