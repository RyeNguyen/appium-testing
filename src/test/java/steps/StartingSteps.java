package steps;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.File;

public class StartingSteps {
    private AppiumDriverLocalService appiumService;

    @Before
    public void startAppiumServer() {
        int port = 4723;
        String nodeJS_Path = "D:\\web\\node\\node.exe";
        String appiumJS_Path = "C:\\Users\\HLC_2021\\AppData\\Local\\Programs\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\appium.js";

        appiumService = AppiumDriverLocalService.buildService(
                new AppiumServiceBuilder()
                        .usingDriverExecutable(new File(nodeJS_Path))
                        .withAppiumJS(new File(appiumJS_Path))
                        .withIPAddress("127.0.0.1")
                        .usingPort(port)
                        .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
        appiumService.start();
    }
    
    @After
    public void stopAppiumServer() {
        appiumService.stop();
    }
}
