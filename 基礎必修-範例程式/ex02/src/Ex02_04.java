
public class Ex02_04 {

	public static void main(String[] args) {
		int a = 10;	// 宣告a為整數，初值為10
		System.out.println("a = " + a);
		int b = a++; 	// a++為後置式
		System.out.println("a = " + a + ",  b = " + b);
		b = ++a; 		// ++a為前置式
		System.out.println("a = " + a + ",  b = " + b);
		b = a--; 		// a--為後置式
		System.out.println("a = " + a + ",  b = " + b);
		b = --a; 		//  --a為前置式
		System.out.println("a = " + a + ",  b = " + b);
	}

}
