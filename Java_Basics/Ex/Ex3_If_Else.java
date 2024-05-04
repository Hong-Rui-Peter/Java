// 流程控制(if...else)
package Exercise;

import java.util.Scanner;

public class Ex3_If_Else {
    public static void main(String[] args) {
        System.out.println("Ex3_If_Else:");
        System.out.print("請輸入一整數:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // 輸入整數型態

        if (number % 2 == 0 && number % 7 == 0) {
            System.out.println(number + "是2及7的倍數");
        } else if (number % 2 == 0) {
            System.out.println(number + "是2的倍數");
        } else if (number % 7 == 0) {
            System.out.println(number + "是7的倍數");
        } else {
            System.out.println(number + "不是2也不是7的倍數");
        }

        sc.close(); // 使用完關閉
    }
}
