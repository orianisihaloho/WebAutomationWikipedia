package demo.steps;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class WikipediaStepsDefinition {

    //OBJECT
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();

    @Given("User open wikipedia home page")
    public void userOpenWikipediaHomePage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on home page")
    public void userInputSearchOnHomePage(String keyword) {

        homePage.inputSearch(keyword);
    }
    //Change @And into @When
    @When("User click button search on home page")
    public void userClickButtonSearchOnHomePage() {
        homePage.clickSearch();
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String title) {
        String actual = articlePage.getTitle();
        Assert.assertEquals(title, actual);
    }
}
