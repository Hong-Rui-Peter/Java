// 執行緒(join)
package Exercise;

// 類別X繼承類別Thread
class X extends Thread {
    String name;

    X(String name) {
        this.name = name;
    }

    // 呼叫類別X時,同時執行類別Y
    public void run() {
        Thread y = new Thread(new Y("Y"));
        y.start();

        try {
            y.join();
        } catch (InterruptedException e) {
            System.err.println("Y causes the illegal exception!" + e);
            System.exit(1);
        }

        for (int i = 1; i <= 30; i += 2) {
            System.out.println(name + ":" + i);
        }
    }
}

// 類別Y實做Runnable介面
class Y implements Runnable {
    String name;

    Y(String name) {
        this.name = name;
    }

    // 執行類別Y時,同時執行類別Z
    public void run() {
        Thread z = new Thread(new Z("Z"));
        z.start();

        try {
            z.join();
        } catch (InterruptedException e) {
            System.err.println("Z causes the illegal exception!" + e);
            System.exit(1);
        }

        for (int i = 1; i <= 30; i *= 3) {
            System.out.println(name + ":" + i);
        }
    }
}

// 類別Z實做Runnable介面
class Z implements Runnable {
    String name;

    Z(String name) {
        this.name = name;
    }

    // Y執行時,同步執行
    public void run() {
        for (int i = 1; i <= 30; i += 5) {
            System.out.println(name + ":" + i);
        }
    }
}

public class Ex15_Thread_Join {
    public static void main(String[] args) {
        System.out.println("Ex15_Thread_Join:");

        Thread x = new X("X");
        x.start(); // 呼叫執行續X
    }
}
