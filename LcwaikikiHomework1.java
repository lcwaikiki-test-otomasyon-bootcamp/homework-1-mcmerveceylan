import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LcwaikikiHomework1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.findElement(By.id("user_1_")).click(); //giriş yap tıkla
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.className("login-form__link")).click();
        driver.findElement(By.name("email")).sendKeys("yanlismail@mail.com");
        driver.findElement(By.name("password")).sendKeys("1234");
        WebElement element= driver.findElement(By.id("RegisterFormView_Password-error"));
        String warning= element.getAttribute("class");
System.out.println( warning);




    }
}
