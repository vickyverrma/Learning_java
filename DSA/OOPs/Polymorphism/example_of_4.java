package OOPs.Polymorphism;
class plane{
    public void takeOff()
    {
        System.out.println("Plane tookOff...");
    }
    public void fly()
    {
        System.out.println("Plane is flying...");
    }
    public void land()
    {
        System.out.println("Plane landed");
    }
}
class passengerPlane extends plane {
    public void takeOff()
    {
        System.out.println("passengerPlane tookOff...");
    }
    public void fly()
    {
        System.out.println("passengerPlane is flying...");
    }
    public void land()
    {
        System.out.println("passengerPlane landed");
    }
}
class cargoPlane extends plane{
    public void takeOff()
    {
        System.out.println("cargoPlane tookOff...");
    }
    public void fly()
    {
        System.out.println("cargoPlane is flying...");
    }
    public void land()
    {
        System.out.println("cargoPlane landed");
    }
}
class fighterPlane extends plane{
    public void takeOff()
    {
        System.out.println("fighterPlane tookOff...");
    }
    public void fly()
    {
        System.out.println("fighterPlane is flying...");
    }
    public void land()
    {
        System.out.println("fighterPlane landed");
    }
}
//override code
class Airport {
    public void allowPlane(plane P)
    {
        P.takeOff();
        P.fly();
        P.land();
        System.out.println("------------");
    }
}

public class example_of_4 {
    public static void main(String[] args) {
        passengerPlane p = new passengerPlane();
        fighterPlane f = new fighterPlane();
        cargoPlane c = new cargoPlane();
        Airport a = new Airport();
        a.allowPlane(p);
        a.allowPlane(f);
        a.allowPlane(c);

    }
}
