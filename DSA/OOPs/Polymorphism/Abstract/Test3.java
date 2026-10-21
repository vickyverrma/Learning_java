package OOPs.Polymorphism.Abstract;
class calculator3 {
    public void add(int a, float b)
    {
        System.out.println(a+b + " int a , float b");
    }
    public void add(float a, int b)
    {
        System.out.println(a+b + " float a , int b");
    }
    public  void add(float a, float b)
    {
        System.out.println(a+b + " float a, float b");
    }
}
public class Test3 {
    public static void main(String[] args) {
        calculator3 c = new calculator3();
        c.add(2,3.4f);
    }
}
