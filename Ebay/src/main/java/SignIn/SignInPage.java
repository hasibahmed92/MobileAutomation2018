package SignIn;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends Base {
    @FindBy (id = "com.ebay.mobile:id/button_register")
    WebElement Registration;
    @FindBy (id = "firstname")
    WebElement FirstName;
    @FindBy (id = "lastname")
    WebElement 	LastName;
    @FindBy (id = "email")
    WebElement Email;
    @FindBy (id = "PASSWORD")
    WebElement Password;
    @FindBy (id = "ppaFormSbtBtn")
    WebElement Register;
    @FindBy(id = "firstname_w")
    WebElement FirstNameErrorMessage;
    @FindBy(id = "lastname_w")
    WebElement LastNameErrorMessage;
    @FindBy(id = "email_w")
    WebElement EmailErrorMessage;
    @FindBy(id = "PASSWORD_w")
    WebElement PasswordErrorMessage;

    public String invalidFirstNameSignUp() {
        Registration.click();
        LastName.sendKeys("Far");
        FirstName.sendKeys("");
        Email.sendKeys("n95@g.com");
        Password.sendKeys("n");
        Registration.click();
        String text = FirstNameErrorMessage.getText();
        return text;
    }


//    public String registrationOption (){
//        Registration.click();
//        LastName.sendKeys("beckham");
//        FirstName.sendKeys("david");
//        Email.sendKeys("db@gmail.com");
//        Password.sendKeys("abc123", Keys.ENTER);
//        Register.click();
//        String text = emailText.getText();
//        return text;
//    }

}
