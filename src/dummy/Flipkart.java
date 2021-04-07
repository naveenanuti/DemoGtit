package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/account/login?ret=/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[contains(@class,'2IX_2- VJZDxU')]")).sendKeys("naveenreddyav@gmail.com");
        driver.findElement(By.xpath("//input[contains(@class,'_3mctLh VJZDxU')]")).sendKeys("naveen@4225");
        driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
        //driver.quit();
    }



}
