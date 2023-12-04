// 用*打印等腰三角形
class Star {
    public static void star() {
        for (int x = -5; x <= 5; x++) {
            Space.spc(5 - Math.abs(x));
            for (int y = 1; y <= Math.abs(x) * 2 + 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Space {
    public static void spc(int n) {
        for (int z = 1; z <= n; z++) {
            System.out.print(" ");
        }
    }
}

public class Isosceles_Triangle {
    public static void main(String[] args) {
        Star.star();
    }
}