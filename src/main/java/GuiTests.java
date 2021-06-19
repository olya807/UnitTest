import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class GuiTests {
    @Test
    public void openGooglePageTest(){
        DriverManagerType driverManagerType = DriverManagerType.CHROME;
        WebDriverManager.getInstance(driverManagerType).setup();

        ChromeDriver driver = new ChromeDriver();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
