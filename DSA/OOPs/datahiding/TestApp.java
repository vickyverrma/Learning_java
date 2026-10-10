package OOPs.datahiding;

class Account {
//    data Security
    private double balance;
// method :: public
    public double getBalance(double balance)
    {
//        perform authentication
        boolean result = validating("vicky","vicky123");
        if(result == true)
        {
            if(this.balance >= balance)
            {
                System.out.println("Amount " + balance + "is withdrawing");
            } else  {
                System.out.println("Account doesn't have enough balance");
            }
        }
        else
        {
            System.out.println("Invalid username or password");
        }


// withdrawing the money

        return balance;
    }
//method :: public
    public double setBalance( double balance)
    {
//         perform authentication
     boolean result = validating("vicky","vicky123");
     if(result==true)
     {

//         deposit the money
         this.balance = this.balance + balance;
         System.out.println("Amount is credited");
     }
     else {
//         throw a meaningful message
         System.out.println("Invalid username and password");
     }

// depositing the money

        return balance;
    }

//    method :: private
    private boolean validating(String username, String password)
    {
//        for validating the logic or for authentication logic
       return username.equalsIgnoreCase("vicky") && password.equals("vicky123");

    }
}
public class TestApp {
    public static void main(String[] args) {
    Account acc = new Account();
        acc.setBalance(1000);
        acc.getBalance(1300);
    }
}
