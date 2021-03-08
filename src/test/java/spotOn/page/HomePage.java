package spotOn.page;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spotOn.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BrowserUtils {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//input[@class='rounded_button'])[1]")
    private WebElement brookViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[2]")
    private WebElement hannaViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[3]")
    private WebElement maggieViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[4]")
    private WebElement rubySueViewDetails;

    @FindBy(xpath = "//*[contains(text(),'Thank you for adopting a puppy!')]")
    private WebElement ThankYouForAdoptingAPuppy;


    public void clickViewDetails(String arg1){
        switch (arg1) {

            case "Brook":
                clickWithJS(brookViewDetails);
                break;
            case "Sparky":
            wait(1);
            WebElement next = driver.findElement(By.xpath("//a[@href='/agency/index?page=2']"));
            next.click();
                wait(1);
                clickWithJS(brookViewDetails);
            break;
            case "Random dog":
                clickWithJS(brookViewDetails);
                break;
            case "Random dog 2":
                wait(1);
                WebElement next2 = driver.findElement(By.xpath("//a[@href='/agency/index?page=2']"));
                next2.click();
                clickWithJS(brookViewDetails);
                break;


        }
    }

    public void verifyTheOrder(String text){
        wait(3);
        WebElement element =driver.findElement(By.xpath("//p[@id='notice']"));
        element.getText();
        Assert.assertEquals(element.getText(),text);


    }


    public void goBackHomePage() {
        wait(3);
        WebElement element =driver.findElement(By.xpath("//input[@value='Adopt Another Puppy']"));
        element.click();
    }
}
