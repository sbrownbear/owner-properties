package owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import owner.config.WebDriverProvider;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void starDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testGoogle() {
        String title = driver.getTitle();
        Assertions.assertEquals("Google", title);
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}


