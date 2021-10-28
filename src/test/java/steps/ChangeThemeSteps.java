//package steps;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//public class ChangeThemeSteps {
//    protected AndroidDriver<?> appiumDriver;
//
//    @io.cucumber.java.en.When("^I launch Telegram$")
//    public void iLaunchTelegram() throws Throwable {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        String platformName = "Android";
//        String platformVersion = "10.0";
//        String deviceName = "4bbac4df";
//        String appPath = "D:\\testing\\projects\\HelloAppium\\app\\Telegram.apk";
//        String serverUrl = "http://127.0.0.1:4723/wd/hub";
//
//        capabilities.setCapability("platformName", platformName);
//        capabilities.setCapability("platformVersion", platformVersion);
//        capabilities.setCapability("deviceName", deviceName);
//        //capabilities.setCapability("fullReset", true);
//        //capabilities.setCapability("newCommandTimeout", 120);
//        capabilities.setCapability("app", appPath);
//        //capabilities.setCapability("appPackage", "org.telegram.messenger");
//        //capabilities.setCapability("appActivity", "org.telegram.ui.LaunchActivity");
//        capabilities.setCapability("appWaitActivity", "*");
//        appiumDriver = new AndroidDriver<>(new URL(serverUrl), capabilities);
//        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    }
//
//    @And("I click on the Sign in button")
//    public void iClickOnTheSignInButton() {
//        appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.TextView").click();
//    }
//
//    @And("A popup will appear and I click OK")
//    public void aPopupWillAppearAndIClickOK() {
//        appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView").click();
//    }
//
//    @Then("I choose my country")
//    public void iChooseMyCountry() {
//        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Choose a country']").click();
//    }
//
//    @And("I press on Search button")
//    public void iPressOnSearchButton() {
//        appiumDriver.findElementByXPath("//android.widget.ImageButton[@content-desc='Search']").click();
//    }
//
//    @Then("I type {string}")
//    public void iType(String searchKeyword) {
//        var textField = appiumDriver.findElementByXPath("//android.widget.EditText[@text='Search']");
//        textField.clear();
//        textField.sendKeys(searchKeyword);
//    }
//
//    @And("I choose {string}")
//    public void iChoose(String arg0) {
//        appiumDriver.findElementByXPath("//android.widget.TextView[@text='Vietnam']").click();
//    }
//
//    @Then("I should see my area code as {string}")
//    public void iShouldSeeMyAreaCodeAs(String expected) throws InterruptedException {
//        Thread.sleep(2000);
//        var textField = appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
//        Assert.assertEquals("Area code matches!", expected, textField.getText());
//    }
//
//    @Then("I type my phone number as {string}")
//    public void iTypeMyPhoneNumberAs(String phoneNumber) {
//        var textField = appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]");
//        textField.clear();
//        textField.sendKeys(phoneNumber);
//    }
//
//    @And("I press the continue button")
//    public void iPressTheContinueButton() {
//        appiumDriver.findElementByXPath("//android.widget.FrameLayout[@content-desc='Done']").click();
//    }
//
//
//    @Then("^I am navigated to validation screen$")
//    public void iAmNavigatedToValidationScreen() {
//        //appiumDriver.openNotifications();
//        //Tạm thời bỏ qua
//    }
//
//    @And("I type my validation code")
//    public void iTypeMyValidationCode() {
//        //Tạm thời bỏ qua
//    }
//
//    @Then("I should see a popup appear and I choose CONTINUE")
//    public void iShouldSeeAPopupAppearAndIChooseCONTINUE() {
//        appiumDriver.findElementByXPath("//android.widget.TextView[@text='CONTINUE']").click();
//    }
//
//    @And("Telegram will ask me some permissions but I choose NOT NOW")
//    public void telegramWillAskMeSomePermissionsButIChooseNOTNOW() {
//        appiumDriver.findElementByXPath("//android.widget.TextView[@text='NOT NOW']").click();
//    }
//
//    @Then("I press the hamburger button")
//    public void iPressTheHamburgerButton() {
//        appiumDriver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Open navigation menu\"]").click();
//    }
//
//    @And("I press {string}")
//    public void iPress(String buttonContent) {
//        appiumDriver.findElementByXPath("//android.widget.TextView[@text=" + buttonContent + "]").click();
//    }
//
//    @Then("I should be able to return to the chat settings page")
//    public void iShouldBeAbleToReturnToTheChatSettingsPage() {
//        appiumDriver.findElementByAccessibilityId("Go back").click();
//    }
//
//    @And("I pick my theme as {string} mode")
//    public void iPickMyThemeAsMode(String mode) {
//        appiumDriver.findElementByXPath("//android.widget.Button[@text=" + mode +"]").click();
//    }
//
//    @Then("I choose my accent color")
//    public void iChooseMyAccentColor() {
//        appiumDriver.findElementByXPath("//android.widget.Button[@text='Accent Color'&index='3']").click();
//    }
//
//    @Then("I choose my favorite background")
//    public void iChooseMyFavoriteBackground() {
//        appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.FrameLayout[1]/android.view.View[2]").click();
//    }
//}
