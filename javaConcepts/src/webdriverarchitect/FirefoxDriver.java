package webdriverarchitect;

public class FirefoxDriver implements Webdriver{

	
	public  FirefoxDriver() {
		System.out.println("Lanching Firefox Browser");
	}
	@Override
	public void get(String Url) {
		System.out.println("launching Url "+ Url);
		
	}

	@Override
	public void Findelement(String Locator) {
		System.out.println("finding elements "+ Locator);
		
	}

	@Override
	public void Close() {
		System.out.println("close the browser");
		
	}

	@Override
	public void Quite() {
		System.out.println("quite all browesers");
		
	}

}
