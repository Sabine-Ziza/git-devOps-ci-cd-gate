package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.HomePage;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        // Automatically download and setup the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
    }
}