// 物件
package Exercise;

// 類別A初始設定
class A {
    String Name = "A大樓設計圖";
    int Size = 30;
    String Price = "300萬";
    int Quantity = 20;
}

public class Ex5_Object {
    public static void main(String[] args) {
        System.out.println("Ex5_Object:");

        // 物件A1(複寫)
        A A1 = new A();
        A1.Name = "A1大樓";
        A1.Price = "350萬";

        // 物件A2(複寫)
        A A2 = new A();
        A2.Name = "A2大樓";
        A2.Quantity = 30;

        System.out.println("A1:\n" +
                "Name:" + A1.Name + "\t" +
                "Size:" + A1.Size + "\t" +
                "Price:" + A1.Price + "\t" +
                "Quantity:" + A1.Quantity + "\t");

        System.out.println("=============================================");

        System.out.println("A2:\n" +
                "Name:" + A2.Name + "\t" +
                "Size:" + A2.Size + "\t" +
                "Price:" + A2.Price + "\t" +
                "Quantity:" + A2.Quantity + "\t");

    }
}
