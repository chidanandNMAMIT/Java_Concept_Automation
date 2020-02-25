package webdriverarchitect;

public class ChromeDriver implements Webdriver {

	public ChromeDriver() {
		System.out.println("Launch Chrome browser");
	}

	@Override
	public void get(String Url) {
		System.out.println("Open Url "+Url);
		
	}

	@Override
	public void Findelement(String Locator) {
		System.out.println("finding the elements "+ Locator);
		
	}

	@Override
	public void Close() {
		System.out.println("Closes the browser");
		
	}

	@Override
	public void Quite() {
		System.out.println("quite all browsers");
		
	}
	
	
}
