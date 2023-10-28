package String;

public class ShortestPath {
    public static double sortestPath(String direction) {
        int x = 0, y = 0;
        for (int i = 0; i < direction.length(); i++) {
            char dir = direction.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            }
            // south
            if (dir == 'S') {
                y--;
            }
            // East
            if (dir == 'E') {
                x++;
            }
            // West
            if (dir == 'W') {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        
        return  Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        System.out.println(sortestPath(direction));
    }
}
