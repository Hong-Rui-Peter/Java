// 陣列
package Exercise;

public class Ex7_Array {
    static int[][] a = new int[4][3];
    static int[][] b = new int[4][3];
    static int[][] c = new int[4][3];

    // 用迴圈初始a、b陣列
    static void initialization() {
        int av = 1, bv = 13;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                a[i][j] = av;
                b[i][j] = bv;
                av++;
                bv++;
            }
        }
    }

    static void ArrayA() {
        for (int i = 0; i < 4; i++) {
            System.out.print("a矩陣" + "[" + i + "]:");
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " , ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void ArrayB() {
        for (int i = 0; i < 4; i++) {
            System.out.print("b矩陣" + "[" + i + "]:");
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " , ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // a、b相加塞進c
    static void ArrayC() {
        for (int i = 0; i < 4; i++) {
            System.out.print("c矩陣" + "[" + i + "]:");
            for (int j = 0; j < 3; j++) {
                System.out.print((c[i][j] = a[i][j] + b[i][j]) + " , ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Ex7_Array:");

        initialization();
        ArrayA();
        ArrayB();
        ArrayC();
    }
}
