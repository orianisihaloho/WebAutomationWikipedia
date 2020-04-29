package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArticlePage {

    public String getTitle(){
        WebElement titleArticle = WebdriverInstance.driver.findElement(By.id("firstHeading"));
        String title = titleArticle.getText();
        return title;
    }
}
