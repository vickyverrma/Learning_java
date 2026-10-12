package OOPs.Variables;
class Loan{
//    static variable
    static float RateofIntrest = 6.7f;
}
public class TestApp2 {
    public static void main(String[] args) {
        Loan a = new Loan();
//        static variable can be accessed using two method 1- using className 2 using reference variable
        System.out.println(a.RateofIntrest); // using reference variable
//        System.out.println(Loan.RateofIntrest); using className.

    }

}
