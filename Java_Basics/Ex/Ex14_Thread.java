// 執行緒
package Exercise;

// Thread為Java內建執行續類別
class A extends Thread {
    String name;

    // 建構子
    A(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(name + ":" + i);
        }
    }
}

// Thread為Java內建執行續類別
class B extends Thread {
    String name;

    // 建構子
    B(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(name + ":" + i);
        }
    }
}

// Runnable為Java內建執行續介面
class C implements Runnable {
    String name;

    // 建構子
    C(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 100; i += 3) {
            System.out.println(name + ":" + i);
        }
    }
}

// Runnable為Java內建執行續介面
class D implements Runnable {
    String name;

    // 建構子
    D(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 100; i += 4) {
            System.out.println(name + ":" + i);
        }
    }
}

// Runnable為Java內建執行續介面
class E implements Runnable {
    String name;

    // 建構子
    E(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(name + ":" + i);
        }
    }
}

public class Ex14_Thread {
    public static void main(String[] args) {
        System.out.println("Ex14_Thread:");

        Thread a = new A("A");
        a.start();

        Thread b = new B("B");
        b.start();

        Thread c = new Thread(new C("C"));
        c.start();

        Thread d = new Thread(new D("D"));
        d.start();

        Thread e = new Thread(new E("E"));
        e.start();
    }
}
