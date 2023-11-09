package OOPS;

public class Constructor {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("Shivanshu");
        student s3 = new student(123);
    }
}

class student {
    String name;
    int roll;

    //Non parametrized Constructor
    student() {
        System.out.println("Constructor is called....");
    }
    //Parametrized Constructor
    student(String name) {
        this.name = name;
    }
    student(int roll){
        this.roll = roll;
    }

}
