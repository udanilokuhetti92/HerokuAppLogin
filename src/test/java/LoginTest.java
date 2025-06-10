import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        // Assert success message
        WebElement message = driver.findElement(By.className("flash"));
        System.out.println("Login message: " + message.getText());
        Assert.assertTrue(message.getText().contains("You logged out of the secure area!"),
                "Login failed with correct credentials!");

        driver.close();
    }

    @Test
    public void wrongUsernameTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith12");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!" + Keys.ENTER);

        // Assert Error message
        WebElement message = driver.findElement(By.className("flash"));
        System.out.println("Login message: " + message.getText());
        Assert.assertTrue(message.getText().contains("Your username is invalid!"),
                "Login failed with incorrect username!");

        driver.close();
    }

    @Test
    public void wrongPasswordTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SecretPassword!" + Keys.ENTER);

        // Assert Error message
        WebElement message = driver.findElement(By.className("flash"));
        Assert.assertTrue(message.getText().contains("Your password is invalid!"),
                "Login failed with incorrect password!");

        driver.close();
    }

    @Test
    public void wrongCredentialsTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmit");
        driver.findElement(By.id("password")).sendKeys("SupersecretPassword!" + Keys.ENTER);

        // Assert Error message
        WebElement message = driver.findElement(By.className("flash"));
        Assert.assertTrue(message.getText().contains("Your username is invalid!"),
                "Login failed with incorrect credentials!");

        driver.quit();
    }
}
