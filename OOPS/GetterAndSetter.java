package OOPS;

public class GetterAndSetter {
    public static void main(String[] args) {
        BankAcc myAcc = new BankAcc();
        myAcc.setUserName("Shivanshu sagar");
        System.out.println(myAcc.getUserName());
        myAcc.setPassword("MyPassword");
        System.out.println(myAcc.getPassword());
    }
}

class BankAcc {
    private String UserName;
    private String Password;

    String getUserName() {
        return this.UserName;
    }

    String getPassword() {
        return this.Password;
    }

    void setUserName(String newUserName) {
        this.UserName = newUserName;
    }

    void setPassword(String newPassword) {
        this.Password = newPassword;
    }
}
