package spotOn.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import spotOn.utils.BrowserUtils;
import java.util.List;
import java.util.Map;

public class PersonInfoPage extends BrowserUtils {


    @FindBy(id = "order_address")
    private WebElement addressBox;

    @FindBy(id = "order_email")
    private WebElement emailBox;

    @FindBy(id = "order_pay_type")
    private WebElement selectPaymentMethod;

    @FindBy(xpath ="//*[@value='Place Order']")
    private WebElement placeOrder;

    public void setName(String name){

        wait(1);
       WebElement element = driver.findElement(By.id("order_name"));
       element.sendKeys(name);
    }

    public void setAddress(String address){
        wait(1);
        WebElement element = driver.findElement(By.id("order_address"));
        element.sendKeys(address);
    }

    public void setEmail(String email){
        wait(1);
        WebElement element = driver.findElement(By.id("order_email"));
        element.sendKeys(email);
    }

    public void fillOutInfo( Map<String,String >  info){

        setName(info.get("Name"));
        setAddress(info.get("Address"));
        setEmail(info.get("email"));

    }

    public void setSelectPaymentMethod(String selectPaymentMethodValue){

        switch (selectPaymentMethodValue) {

            case "Check":
            WebElement element = driver.findElement(By.id("order_pay_type"));
            Select paymentMethod = new Select(element);
            paymentMethod.selectByValue(selectPaymentMethodValue);
            break;
            case "Credit card":
                WebElement ele  = driver.findElement(By.id("order_pay_type"));
                Select payment  = new Select(ele);
                payment.selectByValue(selectPaymentMethodValue);
                break;
        }


    }

    public void placetheOrder() {

        wait(2);
        WebElement element1 = driver.findElement(By.xpath("//*[@value='Place Order']"));
        element1.click();
    }
}
