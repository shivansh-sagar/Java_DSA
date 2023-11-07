package OOPS;

public class ClassAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.tip = 5;
        System.out.println(p1.color+ " "+ p1.tip);
        p1.setColor("red");
        p1.setTip(9);
        System.out.println(p1.color+ " "+ p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
