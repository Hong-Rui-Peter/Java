package ExtendDemo;    //�ŧi�{���ɪ����O�m��extendDemo�M��
 
class CMath {
	public void getMax(int a, int b) {
		int bigNum;
		if (a>b) bigNum = a;
		else bigNum = b;
		System.out.println(a + "�P" + b + "���̤j�Ƭ�" + bigNum);
	}
}

class SonCMath extends CMath {  // SonCMath�~��CMath���O
	public void getFabonacci(int a) {
		int firstNum = 0, secondNum = 1;
		System.out.print("�O���ƦC�G") ;
		System.out.print(firstNum + ", " +secondNum);
		int ans;
		for(int i=2; i<=a; i++) {
			ans = firstNum + secondNum;
			System.out.print(", " +ans);
			firstNum = secondNum;
			secondNum = ans;
		}
	}
}

public class ExtendDemo {
	public static void main(String[] args) {
		SonCMath math1 = new SonCMath();
		math1.getMax(10,20);        //�ϥΤl���O�~�Ӥ����O����k
		System.out.println();
		math1.getFabonacci(10);     //�ϥΤl���O�ۤv����k
	}
}
