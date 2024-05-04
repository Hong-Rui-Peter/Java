// 介面
package Exercise;

// 介面Meals,介面沒有實做內容
interface Meals {
    String breakfast();

    String lunch();

    String dinner();
}

// 抽象類別Food
abstract class Food {
    abstract void eat(); // 抽象方法沒有實做內容
}

// 類別People_A繼承抽象類別Food實做介面Meals
class People_AA extends Food implements Meals {
    public String breakfast() {
        return "蛋餅";
    }

    public String lunch() {
        return "炒飯";
    }

    public String dinner() {
        return "炒麵";
    }

    void eat() {
        System.out.println("people_A:");
        System.out.println("breakfast:" + breakfast() + "\tlunch:" + lunch() + "\tdinner:" + dinner());
    }
}

// 類別People_B繼承抽象類別Food實做介面Meals
class People_BB extends Food implements Meals {
    public String breakfast() {
        return "蔥油餅";
    }

    public String lunch() {
        return "燴飯";
    }

    public String dinner() {
        return "拉麵";
    }

    void eat() {
        System.out.println("people_B:");
        System.out.println("breakfast:" + breakfast() + "\tlunch:" + lunch() + "\tdinner:" + dinner());
    }
}

// 類別People_C繼承抽象類別Food實做介面Meals
class People_CC extends Food implements Meals {
    public String breakfast() {
        return "漢堡";
    }

    public String lunch() {
        return "麥當勞";
    }

    public String dinner() {
        return "肯德基";
    }

    void eat() {
        System.out.println("people_C:");
        System.out.println("breakfast:" + breakfast() + "\tlunch:" + lunch() + "\tdinner:" + dinner());
    }
}

public class Ex12_Interface {
    public static void main(String[] args) {
        System.out.println("Ex12_Interface:");

        People_AA a = new People_AA();
        a.eat();

        People_BB b = new People_BB();
        b.eat();

        People_CC c = new People_CC();
        c.eat();
    }
}