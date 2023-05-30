package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalLocal {


       double pie  = 3.14;//Global Variable
    WebDriver driver; //nul

        public void m1(){
        // local variable
        System.out.println(pie);
            WebDriver driver = new ChromeDriver(); //local
    }
    public void m2(){
        System.out.println(pie);

    }
}
