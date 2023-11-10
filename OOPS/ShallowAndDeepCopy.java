package OOPS;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        stu s1 = new stu();
        s1.name = "Max";
        s1.roll = 3;
        s1.marks[0] = 100;
        s1.marks[1]= 90;
        s1.marks[2]= 70;
        
        stu s2 = new stu(s1);
        s1.marks[1]= 52;
        for(int i =0; i<s1.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
class stu{
    String name;
    int roll;
    int marks[];

    // Shallow Copy
    // stu(stu s1){
    //     this.name = s1.name;
    //     this.marks = s1.marks;
    // }
     
    // Deep Copy
     stu(stu s1){
        marks =  new int[3];
        this.name = s1.name;
        for(int i=0; i<marks.length;i++ ){
            this.marks[i]= s1.marks[i];
        }
    }
    stu(){
        marks = new int[3];
    }

}
