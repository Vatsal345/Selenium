package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum();  //4+5
		sum(100,200);  //100+200
		sum(20,21);  //20+21
		sum(1,2,3);  //1+2+3)
		
		
	}
	
	public static void sum()  {
		int a = 5+4;
		System.out.println(a);
	}
	
	public static void sum(int b, int c)  {
		int a = b + c;
		System.out.println(a);
	}
	
	public static void sum(int p, int q, int r)  {
		int a = p + q + r;
		System.out.println(a);
		
	}


}
