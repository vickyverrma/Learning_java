package OOPs.Polymorphism.Abstract;
class Calculator1{
    public void add(byte a)
    {
        System.out.println(a);
    }
    public void add(double a)
    {
        System.out.println(a);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.add('a'); // since char cannot be converted in byte so compiler convert it into double op is 97.0
        c.add(20);
    }
}
