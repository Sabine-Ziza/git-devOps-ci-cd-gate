package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTests {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Automatically download and setup correct ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Configure Chrome to run in headless mode for CI
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // no GUI
        options.addArguments("--no-sandbox"); // required for CI
        options.addArguments("--disable-dev-shm-usage"); // avoid /dev/shm issues
        options.addArguments("--disable-gpu"); // optional, avoids GPU errors
        options.addArguments("--window-size=1920,1080"); // optional, default window size

        // Initialize Chrome driver with options
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // close browser
        }
    }
}