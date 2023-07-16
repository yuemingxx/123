package fatie;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginClass {
    static WebDriver driver;
    @BeforeAll
    static void setUpClass(){
        driver = new ChromeDriver();
        String url = "https://ceshiren.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }

    @AfterAll
    static void tearDown(){
        driver.quit();
    }

    @Test
    void login() throws InterruptedException {
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("manage");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("manage123");
        driver.findElement(By.xpath("//span[text()='登录']")).click();
        Thread.sleep(3000);
}
