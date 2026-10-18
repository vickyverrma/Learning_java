package OOPs.Polymorphism;
class parents{
    public void property()
    {
        System.out.println("Cash, Gold");
    }
    public void marry()
    {
        System.out.println("Relative Girl");
    }
}
class child extends parents{
//    Overriding
    public void marry()
    {
//        re-implementation
        System.out.println("Some other girl");
    }
}
public class Test4 {
    public static void main(String[] args) {
        parents p1 = new parents();
        p1.property();
        p1.marry();
        child c1 = new child();
        System.out.println("Child");
        c1.property();
        c1.marry();
    }
}
