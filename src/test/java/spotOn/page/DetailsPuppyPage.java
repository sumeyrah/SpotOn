package spotOn.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spotOn.utils.BrowserUtils;

public class DetailsPuppyPage extends BrowserUtils {
    @FindBy(xpath = "//input[@value='Adopt Me!' or type='submit']")
    private WebElement adoptMe;

    @FindBy(xpath = "(//input[@value='View Details' or type='submit'])[1]")
    private WebElement selectBroke;

    public void clickAdoptMe(String adopt){

            WebElement element = driver.findElement(By.xpath("//input[@value='Adopt Me!' or type='submit']"));
            waitForPageToLoad(20);
            element.click();

    }
}
