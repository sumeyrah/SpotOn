package spotOn.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import spotOn.utils.BrowserUtils;
import java.util.List;
import java.util.Map;

public class PersonInfoPage extends BrowserUtils {
    @FindBy(css = "[id='order_name']")
    private WebElement nameBox;

    @FindBy(css = "[id='order_address']")
    private WebElement addressBox;

    @FindBy(css = "[id='order_email']")
    private WebElement emailBox;

    @FindBy(css = "[id='order_pay_type']")
    private WebElement selectPaymentMethod;

    @FindBy(css = "[value='Place Order']")
    private WebElement placeOrder;

    public void setName(String name){
        enterText(nameBox, name);
    }

    public void setAddress(String address){
        enterText(addressBox, address);
    }

    public void setEmail(String email){
        enterText(emailBox, email);
    }

    public void fillOutInfo(List<Map<String, String >> info){
        setName(info.get(0).get("name"));
        setAddress(info.get(0).get("address"));
        setEmail(info.get(0).get("email"));

    }

    public void setSelectPaymentMethod(String selectPaymentMethodValue){
        Select paymentMethod=new Select(selectPaymentMethod);
        paymentMethod.selectByVisibleText(selectPaymentMethodValue);
    }

}
