package spotOn.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spotOn.utils.BrowserUtils;

public class ProceedPage extends BrowserUtils {
    @FindBy(css = "[id='collar']")
    private WebElement collarLeash ;

    @FindBy(xpath = "//input[@id='toy']")
    private WebElement chewToy;

    @FindBy(css = "[id='carrier']")
    private WebElement travelCarrier;

    @FindBy(css = "[id='vet']")
    private WebElement firstVetVisit;

    @FindBy(css = "[value='Complete the Adoption']")
    private WebElement completeTheAdoption;

    @FindBy(css = "[value='Adopt Another Puppy']")
    private WebElement adoptAnotherPuppy;

    @FindBy(css = "[value='Change your mind']")
    private WebElement changeYourMind;

    public void clickChewToy(){
        moveToElem(chewToy);
        clickWithJS(chewToy);
        chewToy.isSelected();
    }

    public void clickTravelCarrier(){
        waitForClickablility(travelCarrier, 10);
        travelCarrier.isSelected();
    }

    public void clickCollarLeash(){
        clickWithJS(collarLeash);
        collarLeash.isSelected();
    }

    public void clickFirstVetVisit(){
        clickWithJS(firstVetVisit);
        firstVetVisit.isSelected();
    }

    public void clickCompleteTheAdoption(){
        clickWithJS(completeTheAdoption);
    }

}
