package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void openHomePage(){
        WebdriverInstance.driver.get("https://www.wikipedia.com/");                                             // call WebdriverInstance class
    }

    public void inputSearch(String keyword){
        WebElement inputSearch = WebdriverInstance.driver.findElement(By.id("searchInput"));                    // find searchInput by ID
        inputSearch.sendKeys(keyword);
    }

    public void clickSearch(){
        WebElement buttonSearch = WebdriverInstance.driver.findElement(By.xpath("//*[@type = 'submit']"));    // find element submit by Xpath
        buttonSearch.click();                                                                                // do click

    }

}
