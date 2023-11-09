package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {
       student1 s1 = new student1();
       s1.name ="shivanshu";
       s1.roll=1234;
       s1.password= "abcd";
       s1.marks[0] =100;
       s1.marks[1] =29;
       s1.marks[2]=87;


       student1 s2 = new student1(s1);
       System.out.println(s2.name);
       System.out.println(s2.roll);

       s1.marks[2]= 52;
       for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
       }

    }
}
class student1{
    String name;
    int roll;
    String password;
    int marks[];

    student1(student1 s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    student1(){
        marks = new int[3];
    }
}
