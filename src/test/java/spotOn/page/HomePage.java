package spotOn.page;

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


    public void clickViewDetails(){
        clickWithJS(brookViewDetails);
    }







}
