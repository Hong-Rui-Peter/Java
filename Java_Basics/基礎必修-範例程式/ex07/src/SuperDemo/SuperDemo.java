package SuperDemo;

class CStu {
	private int weight, height;
	CStu() {
		weight = 0; weight = 0;
	}
	CStu(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	public void showData() {
		System.out.print("�����G" + this.weight + "\t�魫�G" + this.height);
	}
}

class SonCStu extends CStu {
	private int score;
	SonCStu() {
		super();     //�I�sCStu�����O��CStu()�غc��
		score = 0;
	}
	SonCStu(int weight, int height, int score) {
		//�I�sCStu�����O��CStu(int weight, int height)�غc��
		super(weight, height);
		this.score = score;
	}
	public void showData() {
		super.showData();   //�I�s�����O��showData��k
		System.out.print("\t���Z�G" + this.score);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
	    CStu Peter = new CStu(50, 170);
	    Peter.showData();
	    System.out.println("\n");
	    SonCStu Tom = new SonCStu(65, 164, 99);
	    Tom.showData();
	}
}