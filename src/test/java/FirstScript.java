import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class FirstScript {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            System.out.println("Title: " + driver.getTitle());

            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            WebElement textBox = driver.findElement(By.name("my-text"));
            WebElement submitButton = driver.findElement(By.cssSelector("button"));

            textBox.sendKeys("Selenium");
            submitButton.click();

            WebElement message = driver.findElement(By.id("message"));
            System.out.println("Message: " + message.getText());
        } finally {
            driver.quit();
        }
    }
}
