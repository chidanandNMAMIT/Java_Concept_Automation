package webdriverarchitect;

public class AmazonTest {

	public static void main(String[] args) {
		
		Webdriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.Findelement("name");
		driver.Close();
		driver.Quite();
	}
	

}
