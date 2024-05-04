// 多型
package Exercise;

import java.util.Scanner;

class Father { // 父類別
    int year, mon, date;

    // 建構式
    Father(int year, int mon, int date) {
        this.year = year;
        this.mon = mon;
        this.date = date;
    }
}

// 類別Son繼承類別Father
class Son extends Father { // 子類別
    // 建構式
    Son(int year, int mon, int date) {
        super(year, mon, date); // (super)繼承父類別建構式
    }
}

public class Ex10_Polymorphism {
    public static void main(String[] args) {
        System.out.println("Ex10_Polymorphism:");

        Scanner sc = new Scanner(System.in);
        int[] father_birthday = new int[3];
        int[] son_birthday = new int[3];

        System.out.println("請輸入父親的出生年月日:");

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.print("年:");
                    father_birthday[i] = sc.nextInt();
                    break;
                case 1:
                    System.out.print("月:");
                    father_birthday[i] = sc.nextInt();
                    break;
                case 2:
                    System.out.print("日:");
                    father_birthday[i] = sc.nextInt();
                    break;
                default:
                    System.out.println("error,error,error");
            }
        }

        System.out.println("請輸入兒子的出生年月日:");

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.print("年:");
                    son_birthday[i] = sc.nextInt();
                    break;
                case 1:
                    System.out.print("月:");
                    son_birthday[i] = sc.nextInt();
                    break;
                case 2:
                    System.out.print("日:");
                    son_birthday[i] = sc.nextInt();
                    break;
                default:
                    System.out.println("error,error,error");
            }
        }

        Father f = new Father(father_birthday[0], father_birthday[1], father_birthday[2]);
        System.out.println("父親的出生年月日:" + f.year + "/" + f.mon + "/" + f.date);

        Father s = new Son(son_birthday[0], son_birthday[1], son_birthday[2]); // 建立物件前後不一樣是多型
        System.out.println("兒子的出生年月日:" + s.year + "/" + s.mon + "/" + s.date);

        sc.close();
    }
}
