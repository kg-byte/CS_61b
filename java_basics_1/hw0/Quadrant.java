public class Quadrant {
    public static int quadrant(double x, double y) {
        int q;
        if (x == 0 || y ==0) { 
            q = 0; 
        } else if (x > 0 && y > 0) { 
            q = 1;
        } else if (x < 0 && y >0) {
            q = 2;
        } else if (x < 0 && y < 0) {
            q = 3;
        } else {
            q = 4;
        }
        return q;
    }
    public static void main(String[] args) {
        System.out.println(quadrant(12.4, 17.8));
        System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(-15.2, -3.1));
        System.out.println(quadrant(4.5, -42.0));
        System.out.println(quadrant(0.0, 3.14));

    }
}

/* output
1
2
3
4
0
*/