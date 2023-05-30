package automationbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.xml.xpath.XPathException;


public class BrowserInvocation {


    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc");
     //   driver.findElement(By.id ("username")).sendKeys("abc");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.id("Login")).click();
        String actualErrorMessage = driver.findElement(By.id("error")).getText();
        String ErrorMessage.equals
        System.out.println(errorMessage);




    }










}
