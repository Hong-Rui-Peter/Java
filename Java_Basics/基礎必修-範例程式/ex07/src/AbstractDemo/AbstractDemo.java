package AbstractDemo;

abstract class Ccar {    //��H���O
	int speed;
	public abstract void addSpeed(int s);  //��H��k�S����@���e
	public static void showData() {        //�R�A��k
		System.out.println("�Ҧ������l���i�H�[�t!!\n");
	}
}

class PiliCar extends Ccar {
	//�~��Ccar��H���O�A������@Ccar���O��addSpeed��H��k
	public void addSpeed(int s) {
		System.out.println("�R�E���ثe�t�סG" + speed);
		speed += s;
		System.out.println("�R�E��  �[�t��G" + speed);
	}
}

class BMWCar extends Ccar {
	//�~��Ccar��H���O�A������@Ccar���O��addSpeed��H��k
	public void addSpeed(int s) {  //��@addSpeed��H��k
		System.out.println("BMW�ثe�t�סG" + speed);
		speed += s ;
		if(speed <= 200) {
			System.out.println("BMW  �[�t��G" + speed);
		}
		else {
			System.out.println("BMW�̤j�t�� 200 �L�k�A�[�t�F");
		}
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Ccar.showData();   //�I�sCcar��H���O��showData()�R�A��k
	    PiliCar car1 = new PiliCar();
	    car1.addSpeed(150);
	    car1.addSpeed(120);
	    System.out.println();
	    BMWCar car2 = new BMWCar();
	    car2.addSpeed(150);
	    car2.addSpeed(120);
	    //Ccar car3 = new Ccar();  //���~�A��H���O�L�k���͹���
	}
}
