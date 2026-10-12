package OOPs.Variables;
class claculator{
    public void add(int a, int b)
    {
        int result = a+b;
        System.out.println("The sum is :: " + result);
    }
}
public class TestAppLocal {
    public static void main(String[] args) {
        claculator c = new claculator();
        c.add(4,5);

    }
}
