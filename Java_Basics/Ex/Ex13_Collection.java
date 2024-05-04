// 泛型&集合(Generic&Collections)
package Exercise;

import java.util.*;

public class Ex13_Collection {
    static List<Integer> l = Arrays.asList(1, 5, 3, 7, 9, 7, 5);

    static void func_HashSet() {
        System.out.println("不加泛型,使用for each語法");

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.addAll(l);

        for (Object obj : hs) {
            System.out.print(obj + ",");
        }

        System.out.println();
    }

    static void func_ArrayList() {
        System.out.println("不加泛型,使用iterator語法");

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.addAll(l);
        Iterator<Integer> i = al.iterator();

        while (i.hasNext()) {
            System.out.print(i.next() + ",");
        }

        System.out.println();
    }

    static void func_TreeSet() {
        System.out.println("加入泛型,使用for each語法");

        Set<Integer> ts = new TreeSet<Integer>();
        ts.addAll(l);

        for (Integer i : ts) {
            System.out.print(i + ",");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Ex13_Collection:");

        func_HashSet();
        func_ArrayList();
        func_TreeSet();
    }
}
