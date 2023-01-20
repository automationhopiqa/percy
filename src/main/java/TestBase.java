import io.github.bonigarcia.wdm.WebDriverManager;
import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBase {
	private static WebDriver driver;
	private static Percy percy;

	public static void main(String[] args) throws InterruptedException {

		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		driver = new FirefoxDriver(options);
		percy = new Percy(driver);

		driver.get("https://example.com");
		percy.snapshot("Java example");

		/*
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// Navigate to the demoqa website
		driver.manage().window().maximize();
		driver.get("https://www.boyner.com.tr/");
		Thread.sleep(10000);
		driver.quit();

	 */
	}
}
