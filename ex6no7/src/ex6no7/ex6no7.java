package ex6no7;

public class ex6no7 {  //  262p
	public static void main(String[] args) {
		firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
