package spotOn.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spotOn.utils.BrowserUtils;

public class ProceedPage extends BrowserUtils {
    @FindBy(id = "collar")
    private WebElement collarLeash ;

    @FindBy(id = "toy")
    private WebElement chewToy;

    @FindBy(id = "carrier")
    private WebElement travelCarrier;

    @FindBy(id = "vet")
    private WebElement firstVetVisit;

    @FindBy(xpath = "//*[contains(text(),'Complete the Adoption')]")
    private WebElement completeTheAdoption;

    @FindBy(css = "[value='Adopt Another Puppy']")
    private WebElement adoptAnotherPuppy;

    @FindBy(css = "[value='Change your mind']")
    private WebElement changeYourMind;


    public void selectAccesories(String arg){

         switch (arg){

             case "Chew Toy":
                 wait(1);
                 clickChewToy();
                 break;
             case "Travel Carrier":
                 clickTravelCarrier();
                 break;
             case "Random Accessories":
                 wait(1);
                 clickChewToy();
                 break;
             case "Random Accessories 2":
                 clickTravelCarrier();
                 break;
             case "Random Accessories 3":
                 wait(1);
                 clickChewToy();
                 break;
             default:
                 System.out.println("No Accesories selected");
         }

    }




    public void clickChewToy(){
        wait(2);
        WebElement element = driver.findElement(By.id("toy"));
        waitForVisibility(element,30);
        element.click();
    }

    public void clickTravelCarrier(){
        wait(2);
        WebElement element = driver.findElement(By.id("carrier"));
        waitForClickablility(element, 10);
        element.click();
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
        wait(2);
        WebElement element = driver.findElement(By.xpath("//input[@value='Complete the Adoption']"));
        waitForClickablility(element, 10);
        element.click();
    }

}
