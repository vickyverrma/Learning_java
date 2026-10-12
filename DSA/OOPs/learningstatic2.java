package OOPs;

public class learningstatic2 {
     static learningstatic2 obj = new learningstatic2();
    public static void main(String... args) {

//        obj.fun();
        obj.fun2();

    }
    void fun()
    {
        System.out.println("non static function");
//        fun2();
    }

    static void fun2()
    {
        obj.fun();
        System.out.println("static function");

    }
}
