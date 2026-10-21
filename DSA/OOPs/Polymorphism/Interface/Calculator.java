package OOPs.Polymorphism.Interface;
interface Icalculator{
    void add(int a , int b);
    void sub(int a , int b);
    void mul(int a , int b);
    void div(int a , int b);
}
 abstract class calculatorImp implements Icalculator{

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
        Icalculator c = new calculatorImp() {
            public void add(int a, int b) {
                System.out.println("The sum is "+(a+b));
            }
        };
        c.add(3,4);
        c.sub(7,8);
        c.mul(21,1);
        c.div(4,2);

    }
}
