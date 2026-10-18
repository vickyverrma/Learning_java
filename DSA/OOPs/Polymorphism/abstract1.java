package OOPs.Polymorphism;
 abstract class parent2 {
    public abstract void methodone();
}
class child2 extends parent2{
     public void methodone()
     {
         System.out.println("abstract class implemented");
     }
 }
public class abstract1 {
    public static void main(String[] args) {
        child2 c = new child2();
        c.methodone();
    }
}
