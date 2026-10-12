package OOPs.constructor;

class Student2 {

    String name;
    int rollNo;
    int age;

    Student2()
    {
        name = "unknow";
        rollNo = 5;
    }

    void study() {
        System.out.println(name + " is studying");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

public class first {

    public static void main(String[] args) {

        Student2 s1 = new Student2();

//        s1.name = "Vicky";
//        s1.rollNo = 101;
//        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.age);

        s1.study();
        s1.eat();
    }
}