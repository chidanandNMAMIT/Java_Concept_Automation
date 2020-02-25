package filpkart;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.flipkart.Pages.HomePage;
import com.qa.flipkart.Pages.LoginPage;

public class LogipageTest extends BaseTest{

	public static LoginPage loginpage;
	public static HomePage homepage;
	
	@Test
	public void loginPageTest() throws IOException {
		loginpage=new LoginPage();
		homepage=loginpage.login();
	}
	
}
