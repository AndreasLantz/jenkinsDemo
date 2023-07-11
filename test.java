import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class test {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        
        // Provide the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        Thread.sleep(5000);
        driver.quit();
    }
}

// This works!!!