package tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = sum();
		System.out.println(x);
		System.out.println(x + 5);
		
		String y = hello();
		System.out.println(y);

	}
	
	public static int sum()  {
		int a = 4+5;
		return a;
	}
	
	public static String hello() {
		String s = "Hello Java";
		return s;
	}

}
