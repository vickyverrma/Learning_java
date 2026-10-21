package OOPs.Polymorphism.Abstract;

abstract class bird{
    public abstract void fly();
    public abstract void eat();
}
class sparrow extends bird{
    public void fly()
    {
        System.out.println("Sparrow fly @low height");
    }
    public void eat()
    {
        System.out.println("Sparrow eats grains..");
    }
}
abstract class eagle extends bird{
    public void fly()
    {
        System.out.println("eagle is flying");
    }
    public abstract void eat();
}
class SerpentEagle extends eagle{
    public void eat()
    {
        System.out.println("Serpent eagle eats Snakes..");
    }
}
class GoldenEagle extends eagle{
    public void eat()
    {
        System.out.println("Golden eagle catches prey over the ocean ocean..");
    }
}
class crow extends bird{
    public void fly()
    {
        System.out.println("crow flying @midium height");
    }
    public void eat()
    {
        System.out.println("crow eats grains and insects..");
    }
}
class Sky{
    public  void allowBirds(bird ref)
    {
        ref.fly();
        ref.eat();
        System.out.println();
    }
}
public class abstract_example_7 {
    public static void main(String[] args) {
        Sky sky = new Sky();
        sky.allowBirds(new sparrow());
        sky.allowBirds(new crow());
        sky.allowBirds(new SerpentEagle());
        sky.allowBirds(new GoldenEagle());

    }

}
