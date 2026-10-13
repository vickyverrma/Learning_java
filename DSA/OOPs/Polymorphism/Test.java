package OOPs.Polymorphism;
class calculator {
//    method over-ridding same method name but different argument or method signature
    public void add(int a, int b)
    {
        System.out.println("performing int-int operation");
        System.out.println(a+b);
    }
    public void add(float a, float b)
    {
        System.out.println("performing float-float operation");
        System.out.println(a+b);
    }
    public void add(double a, double b)
    {
        System.out.println("performing double-double operation");
        System.out.println(a+b);
    }
}
public class Test {
    public static void main(String[] args) {
       calculator c = new calculator();
       c.add(3,4);
    }
}
