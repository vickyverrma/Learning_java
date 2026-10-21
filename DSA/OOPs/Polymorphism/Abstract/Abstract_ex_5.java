//Exposing the set of services but hiding the internal implementation
//abstract class Plane

package OOPs.Polymorphism.Abstract;

abstract class Plane
{
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}
class CargoPlane extends Plane
{
    public void takeOff(){
        System.out.println("CargoPlane tookOff..");
    }
    public void fly(){
        System.out.println("CargoPlane flying..");
    }
    public void land(){
        System.out.println("CargoPlane landing..");
    }
}
class PassengerPlane extends Plane
{
    public void takeOff(){
        System.out.println("PassengerPlane tookOff..");
    }
    public void fly(){
        System.out.println("PassengerPlane flying..");
    }
    public void land(){

        System.out.println("PassengerPlane landing..");
    }
}
class FighterPlane extends Plane
{
    public void takeOff(){
        System.out.println("FighterPlane tookOff..");
    }
    public void fly(){
        System.out.println("FighterPlane flying..");
    }
    public void land(){
        System.out.println("FighterPlane landing..");
    }
}
class Airport1
{
    public void allowPlane(Plane abc){
        abc.takeOff();
        abc.fly();
        abc.land();
        System.out.println();
    }
}
public class Abstract_ex_5 {
    public static void main(String[] args) {
        Airport1 a =new Airport1();
        a.allowPlane(new PassengerPlane());
        a.allowPlane(new FighterPlane());
        a.allowPlane(new CargoPlane());
    }
}