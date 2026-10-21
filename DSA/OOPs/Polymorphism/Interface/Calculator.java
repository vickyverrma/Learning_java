package OOPs.Polymorphism.Interface;
interface Icalculator{
    void add(int a , int b);
    void sub(int a , int b);
    void mul(int a , int b);
    void div(int a , int b);
}
 class calculatorImp implements Icalculator{

    public void add(int a, int b) {
        System.out.println("The sum is "+ (a+b));
    }
    public void sub(int a, int b) {
        System.out.println("The subtraction is "+ (a+b));
    }
    public void mul(int a, int b) {
        System.out.println("The multiplication is "+ (a+b));
    }
    public void div(int a, int b) {
        System.out.println("The division is "+ (a+b));
    }
}

public class Calculator {
    public static void main(String[] args) {
        Icalculator c = new calculatorImp();
        c.add(3,4);

    }
}
