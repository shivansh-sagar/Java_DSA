package OOPS;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.UserName = "Shivanshu";
        myAcc.setPassword("abcd");
        System.out.println(myAcc.UserName);
        
        
    }
    
}
class BankAccount{
        public String UserName;
        private String Password = "abcd1234";
        public void setPassword(String pwd){
            Password = pwd;
        }
    }
