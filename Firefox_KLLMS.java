package org.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Firefox_KLLMS {
    @Test
    public void test() {
        System.out.println("welcome");
        System.setProperty("webdriver.gecko.driver", "C:/Program Files/webdriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://lms.kluniversity.in/login/index.php");
        System.out.println(driver.getTitle());
        highlight(driver, driver.findElement(By.id("username")));
        highlight(driver, driver.findElement(By.name("password")));
        highlight(driver, driver.findElement(By.className("logo-header")));
        //highlight(driver, driver.findElement(By.linkText("Lost password?")));
        highlight(driver, driver.findElement(By.tagName("h1")));
        highlight(driver, driver.findElement(By.cssSelector("button[type='button']")));
        highlight(driver,driver.findElement(By.xpath("//button[@id='loginbtn']")));
    }

    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid violet;');", element);
    }
}