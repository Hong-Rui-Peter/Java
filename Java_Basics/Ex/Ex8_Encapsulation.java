// 封裝
package Exercise;

import java.util.Scanner;

// 用private封裝
class X {
    private int x1, x2;

    private int x3() {
        int x4 = x1 * x2;
        return x4;
    }

    void setValue(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    int getValue() {
        return x3();
    }
}

public class Ex8_Encapsulation {
    public static void main(String[] args) {
        System.out.println("Ex8_Encapsulation");
        System.out.print("請輸入兩個整數:");

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();

        X x = new X();
        x.setValue(x1, x2);
        System.out.println(x.getValue());

        sc.close(); // 使用完關閉
    }
}