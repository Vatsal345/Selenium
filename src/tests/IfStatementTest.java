package tests;

public class IfStatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a = 10;
		int b = 10;
		
		if (a==b) {
			System.out.println("a and b are equal");
		} else {
			System.out.println("a and b are not equal");
		}
		
		String expected = "Selenium";
		String actual = "Selenium";
		
		if(expected.equals(actual))  {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}
	
}
