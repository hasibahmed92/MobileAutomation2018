package Nexus5;


import SignIn.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends SignInPage {
    SignInPage signInPage;

    @BeforeMethod
    public void setSignIn(){
        signInPage = PageFactory.initElements(ad, SignInPage.class); }

    @Test
    public void test1(){
        String actual = signInPage.invalidFirstNameSignUp();
        String expected = "Something's wrong with your email address. Please try again.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

}
