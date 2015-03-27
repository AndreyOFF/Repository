/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverProject {

    public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");  
     String login_name = "AndreyOFF";
     String repository = "Repository";
     
     WebDriver driver = new ChromeDriver();
     driver.get("https://github.com/login");
     WebElement login = driver.findElement(By.id("login_field"));
     WebElement password = driver.findElement(By.id("password"));
     WebElement submit = driver.findElement(By.name("commit"));
     login.sendKeys(login_name);
     password.sendKeys("34568936189212z");
     submit.click();
     
     driver.get("https://github.com/new");
     WebElement rname = driver.findElement(By.id("repository_name"));
     WebElement description = driver.findElement(By.id("repository_description"));
     rname.sendKeys(repository);
     description.sendKeys("Uncle Benz");
     WebElement create = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
     create.click();
     
//     driver.get("https://github.com/" + login_name + "/" + repository + "/settings");
//     WebElement delete =driver.findElement(By.xpath("//a[@href=\"#delete_repo_confirm\"]"));
//     delete.click();
     
     
        
    }
    
}
