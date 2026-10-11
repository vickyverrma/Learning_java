package OOPs.datahiding;
class employee{
    private int eid;
    private String name;
    private int age;
    private String address;
//  setter method
    public void setEid(int eid)
    {
        this.eid = eid;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
//    getter method

    public int getEid()
    {
        return eid;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;
    }

}
public class employeeApp {
    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee();
        e1.setEid(101);
        e1.setName("Vicky");
        e1.setAge(22);
        e1.setAddress("Bokaro, Jharkhand");

        e2.setEid(102);
        e2.setName("Rahul");
        e2.setAge(22);
        e2.setAddress("Ranchi, Jharkhand");

//        calling getter method
        System.out.println(e1.getEid() + " " + e1.getName() + " " + e1.getAge() + " " + e1.getAddress());
        System.out.println(e2.getEid() + " " + e2.getName() + " " + e2.getAge() + " " + e2.getAddress());




    }
}
