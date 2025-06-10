import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!" + Keys.ENTER);
        driver.findElement(By.className("icon-signout")).click();
        driver.close();
    }

    @Test
    public void wrongUsernameTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith12");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!" + Keys.ENTER);
        driver.close();
    }

    @Test
    public void wrongPasswordTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SecretPassword!" + Keys.ENTER);
        driver.close();
    }

    @Test
    public void wrongCredentialsTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmit");
        driver.findElement(By.id("password")).sendKeys("SupersecretPassword!" + Keys.ENTER);
        driver.quit();
    }
}
