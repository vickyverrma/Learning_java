package OOPs.constructor;
class Studenttest{
    String name;
    int roll;
    int grade;
    Studenttest(String name, int roll, int grade)
    {
        this.name=name;
        this.roll = roll;
        this.grade = grade;
    }
    void display()
    {
        System.out.println("Name is :: " + name);
        System.out.println("Roll no is :: " + roll);
        System.out.println("Grade is :: " + grade);
    }
}
public class Parameterizedconst {
    public static void main(String[] args) {
        Studenttest std1 = new Studenttest("Vicky", 22, 12);
        Studenttest std2 = new Studenttest("Rahul",23,12);
        std2.display();
        System.out.println();
        std1.display();
    }
}
