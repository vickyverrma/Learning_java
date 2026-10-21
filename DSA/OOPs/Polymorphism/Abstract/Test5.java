package OOPs.Polymorphism.Abstract;
//class parent {
//    public final void  methodOne()
//    {
//        System.out.println("parentclass::methodOne");
//        O/P
//        java: methodOne() in OOPs.Polymorphism.Abstract.childfinal cannot override methodOne() in OOPs.Polymorphism.Abstract.parent
//  overridden method is final
//    }
//}
    class parent {
    public  void methodOne()
    {
        System.out.println("parentclass::methodOne");
    }
}

class childfinal extends parent{
    public void methodOne()
    {
        System.out.println("Childclass::methodOne");
    }
}
public class Test5 {
    public static void main(String[] args) {
        childfinal c1 = new childfinal();
        c1.methodOne();
    }
}
