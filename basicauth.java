import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basicauth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
		ChromeOptions options = new ChromeOptions();
                chromechoice = old chromechoice ();	
		WebDriver driver = new ChromeDriver(options);
		/home/lavanya/pushdirectory/project/uifrontend/ptests/basicauth.java
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("httpbin.org");

		((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("foo", "bar"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
	}

}
