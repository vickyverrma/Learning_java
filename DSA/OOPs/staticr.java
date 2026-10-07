package OOPs;

public class staticr {
    static int a = 4;
    static int b;
//    it didn't ran twice because static block runs only one
     static {
         System.out.println("I am a static block");
         b = a*3;
     }

    public static void main(String[] args) {
         staticr obj = new staticr();
        System.out.println(obj.a + " " + obj.b);
//        let's create an another object and see static block will run again or not
        staticr.b+=3;
        staticr obj2 = new staticr();
        System.out.println(obj2.a + " " + obj2.b);
    }

}
