// 流程控制(for...loop)
package Exercise;

import java.util.Scanner;

public class Ex4_For_Loop {
    public static void main(String[] args) {
        System.out.println("Ex4_For_Loop:");
        System.out.print("請輸入一正整數:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 輸入整數型態
        int sum = 0;

        for (int initial = 0; initial <= a; initial += 7) {
            sum += initial;
        }

        System.out.println("從1到" + a + "且倍數為7的總和是:" + sum);

        sc.close(); // 使用完關閉
    }
}
