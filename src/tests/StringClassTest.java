package tests;

public class StringClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tool = "Selenium";
		System.out.println(tool);
		
		String type = "Automation";
		System.out.println(type);
		
		String s = " ";
		System.out.println(tool + type);
		System.out.println(tool + " " + type);
		System.out.println(tool + s + type);
		
		int a = 10;
		int b = 20;
		
		System.out.println(tool + type + a + b);  //1020
		System.out.println(a + b + tool + type);  //30
		System.out.println(tool + type + (a + b)); //30

	}

}
