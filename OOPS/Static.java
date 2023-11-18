package OOPS;

public class Static {
    public static void main(String[] args) {
        StudentS s1 = new StudentS();
        s1.school = "Knipss";
        StudentS s2 = new StudentS();
        System.out.println(s2.school);
    }
}
class StudentS {
    String name;
    int rollno;
    static String school;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
