package OOPs.Polymorphism.Abstract;
class Animal {
    public void eat()
    {
        System.out.println("Animal is eating...");
    }
    public void sleep()
    {
        System.out.println("Animal is sleeping...");
    }
}
class Monkey extends Animal{
    public void eat()
    {
        System.out.println("Monkey steals and eats...");
    }
    public void sleep()
    {
        System.out.println("Monkey is sleeping...");
    }
}
class Deer extends Animal{
    public void eat()
    {
        System.out.println("Deer graze and eats...");
    }
    public void sleep()
    {
        System.out.println("Deer is sleeping...");
    }
}
class Lion extends Animal{
    public void eat()
    {
        System.out.println("Lion hunts and eats...");
    }
    public void sleep()
    {
        System.out.println("Lion is sleeping...");
    }
}
class  forest{
    public void behaviour(Animal a)
    {
        a.eat();
        a.sleep();
        System.out.println("----------");
    }
}
public class example_of_4_ {
    public static void main(String[] args) {
//        Animal a = null;
//        a = new Monkey();
//        a.eat();
//        a.sleep();
//        System.out.println("----------");
//        a = new Deer();
//        a.eat();
//        a.sleep();
//        System.out.println("----------");
//        a = new Lion();
//        a.eat();
//        a.sleep();
//        System.out.println("----------");

        forest f = new forest();
        f.behaviour(new Monkey());
        f.behaviour(new Deer());
        f.behaviour(new Lion());

    }
}
