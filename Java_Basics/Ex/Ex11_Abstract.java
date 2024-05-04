// 抽象
package Exercise;

import java.util.Scanner;

// (abstract)抽象類別
abstract class People {
    Scanner sc = new Scanner(System.in);
    String eat = "rice";
    String drink = "water";

    abstract String play(); // 抽象方法,沒有實作內容
}

// 類別People_A繼承抽象類別People
class People_A extends People {
    // 需實做父類別的抽象方法
    public String play() {
        System.out.print("請輸入玩的項目:");
        String play = sc.next();

        return play;
    }
}

// 類別People_B繼承抽象類別People
class People_B extends People {
    // 需實做父類別的抽象方法
    public String play() {
        System.out.print("請輸入玩的項目:");
        String play = sc.next();

        return play;
    }
}

// 類別People_B繼承抽象類別People
class People_C extends People {
    // 需實做父類別的抽象方法
    public String play() {
        System.out.print("請輸入玩的項目:");
        String play = sc.next();

        return play;
    }
}

public class Ex11_Abstract {
    public static void main(String[] args) {
        System.out.println("Ex11_Abstract:");

        People a = new People_A(); // 多型
        System.out.println("同學A:");
        System.out.println("吃:" + a.eat + " 喝:" + a.drink + " 玩:" + a.play());

        People b = new People_B(); // 多型
        System.out.println("同學B:");
        System.out.println("吃:" + b.eat + " 喝:" + b.drink + " 玩:" + b.play());

        People c = new People_C(); // 多型
        System.out.println("同學C:");
        System.out.println("吃:" + c.eat + " 喝:" + c.drink + " 玩:" + c.play());

        a.sc.close(); // 使用完關閉
    }
}