package Strings;

public class ShortestPath {
    public static float shortestPath(String path) { // time complexity = O(n)- single loop 
        int x = 0; 
        int y = 0;

        for(int i = 0; i < path.length(); i++ ){
            //south
            if (path.charAt(i) == 'S') {
                y++;
            } else if (path.charAt(i) == 'N') {
                y--;
            }else if (path.charAt(i) == 'W') {
                x--;
            }else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(Y2 + X2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
