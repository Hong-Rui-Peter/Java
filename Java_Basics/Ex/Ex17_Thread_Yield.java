// 執行緒(yield)
package Exercise;

class Bool {
    static int xBool = 0;
    static int yBool = 0;
    static int zBool = 0;
}

class X extends Thread {

    String name;

    X(String name) {
        this.name = name;
    }

    public void run() {
        while (Bool.yBool == 0 || Bool.zBool == 0) {
            Thread.yield();
        }

        for (int i = 1; i <= 30; i += 2) {
            System.out.println(name + ":" + i);
        }

        Bool.xBool = 1;
    }
}

class Y implements Runnable {
    String name;

    Y(String name) {
        this.name = name;
    }

    public void run() {
        while (Bool.zBool == 0) {
            Thread.yield();
        }

        for (int i = 1; i <= 30; i *= 3) {
            System.out.println(name + ":" + i);
        }

        Bool.yBool = 1;
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

        Bool.zBool = 1;
    }
}

public class Ex17_Thread_Yield {
    public static void main(String[] args) {
        System.out.println("Ex17_Thread_Yield:");

        Thread x = new X("X");
        x.start();

        Thread y = new Thread(new Y("Y"));
        y.start();

        Thread z = new Thread(new Z("Z"));
        z.start();
    }
}
