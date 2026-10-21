package OOPs.Polymorphism.Interface;
interface normalCalculator{
    void add(int a, int b);
    void sub(int a, int b);
}
interface advanceCalculator {
    void mul(int a, int b);
    void div(int a, int b);
}
class Icalculatorimp implements advanceCalculator , normalCalculator{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void sub(int a, int b)
    {
        System.out.println(a-b);
    }
    public void mul(int a, int b)
    {
        System.out.println(a*b);
    }
    public void div(int a, int b)
    {
        System.out.println(a/b);
    }


}
public class multiple_inheritance_ex {
    public static void main(String[] args) {
        advanceCalculator c = new Icalculatorimp();
        normalCalculator d = new Icalculatorimp();
        d.add(10,5);
        d.sub(10,5);
        c.mul(10,5);
        c.div(10,5);
    }
}
