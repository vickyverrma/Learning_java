package OOPs.datahiding;
class student {
    private int rollno;
    private String Name;
    private String address;

//    setter method
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setAddress(String address){
        this.address = address;
    }

//    getter method


    public int getRollno() {
        return rollno;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return address;
    }

}

public class StudentApp {
    public static void main(String[] args) {
    student s1 = new student();
//    calling setter method
    s1.setRollno(1);
    s1.setName("Vicky");
    s1.setAddress("Bokaro,Jharkhand");

//    calling getter method
    System.out.println( s1.getRollno() + " " + s1.getName() + " " + s1.getAddress()   );



    }
}
