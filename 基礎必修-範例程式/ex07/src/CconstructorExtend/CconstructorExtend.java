package CconstructorExtend;

class CStu {
	CStu() {
		System.out.println("���� CStu ���غc���I \n");
	}
}

class SonCStu extends CStu {
	SonCStu() {
		System.out.println("���� SonCStu ���غc���I \n");
	}
}

class GrandsonCStu extends SonCStu {
	GrandsonCStu() {
		System.out.println("���� GrandsonCStu ���غc���I \n");
	}
}

public class CconstructorExtend {
	public static void main(String[] args) {
		new GrandsonCStu();
	}
}
