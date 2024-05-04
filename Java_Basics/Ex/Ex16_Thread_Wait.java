// 執行緒(wait)
package Exercise;

class X extends Thread {
    String name;

    X(String name) {
        this.name = name;
    }

    // 同步執行
    public synchronized void run() {
        try {
            this.wait(200); // 等待200秒
        } catch (InterruptedException e) {
            System.err.println("Y causes the illegal exception!" + e);
            System.exit(1);
        }

        for (int i = 1; i <= 30; i += 2) {
            System.out.println(name + ":" + i);
        }
    }
}

class Y implements Runnable {
    String name;

    Y(String name) {
        this.name = name;
    }

    // 同步執行
    public synchronized void run() {
        try {
            this.wait(100); // 等待100秒
            ;
        } catch (InterruptedException e) {
            System.err.println("Z causes the illegal exception!");
            System.exit(1);
        }

        for (int i = 1; i <= 30; i *= 3) {
            System.out.println(name + ":" + i);
        }
    }
}

class Z implements Runnable {
    String name;

    Z(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 30; i += 5) {
            System.out.println(name + ":" + i);
        }
    }
}

public class Ex16_Thread_Wait {
    public static void main(String[] args) {
        System.out.println("Ex16_Thread_Wait:");

        Thread x = new X("X"); // 多型
        x.start();

        Thread y = new Thread(new Y("Y"));
        y.start();

        Thread z = new Thread(new Z("Z"));
        z.start();
    }
}
