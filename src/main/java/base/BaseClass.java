package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import static utils.Iconstant.*;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AboutYouPage;
import pages.HomePage;
import utils.ReadProperties;

public class BaseClass {

	public WebDriver driver;
	ReadProperties envVar;
	protected HomePage homePage;
	protected AboutYouPage aboutYouPage;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	

	@BeforeSuite
	public void setUpSuit() {
		envVar = new ReadProperties();
	}

	@BeforeMethod
	public void setUpDriver() {
		initDriver(envVar.getProperties(BROWSER));
		initClasses(driver);
		driver.get(envVar.getProperties(URL));
		long pageloadWait = envVar.getNumProperties(PAGELOAD_WAIT);
		long implicitWait = envVar.getNumProperties(IMPLICIT_WAIT);
		long explicitWait = envVar.getNumProperties(EXPLICIT_WAIT);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageloadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
		js = (JavascriptExecutor)driver;

	}
	
	private void initClasses(WebDriver driver) {
		homePage = new HomePage(driver);
		aboutYouPage = new AboutYouPage(driver);
		
		
	}

	private void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}

	}
	
	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
