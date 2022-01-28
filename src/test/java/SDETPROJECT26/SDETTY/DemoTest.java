
package SDETPROJECT26.SDETTY;
import org.testng.annotations.Test;
public class DemoTest  {
	@Test
	public void read() {
		 System.out.println("Reading Data from cmd line");
		 		 String URL = System.getProperty("url");
		 String USERNAME = System.getProperty("username");
		 String PASSWORD = System.getProperty("password");
		 System.out.println("Enter url");
		 System.out.println("Enter username");
		 System.out.println("Enter password");
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
	