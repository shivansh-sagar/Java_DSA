package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}
interface ChessPlayer{
    void move();
}
class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up, down, left, right, diagonal(in all direction)");
    }
}
class Rook implements ChessPlayer{
    public void move(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("up, down, left, right, diagonal -(One step only)");
    }
}