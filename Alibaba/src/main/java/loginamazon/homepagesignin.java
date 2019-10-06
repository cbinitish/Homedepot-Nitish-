package loginamazon;

import base.CommonAPI;
import org.testng.annotations.Test;

public class homepagesignin extends CommonAPI {
    @Test
    public void clickonsignin () throws InterruptedException {
        clickByXpath("//span[contains(text(),'Hello, Sign in')]");
        Thread.sleep(2000);
        clickByXpath("//input[@id='ap_email']");
        Thread.sleep(2000);

        typeByXpath("//input[@id='ap_email']", "amazonpro111@gmail.com");
        clickByXpath("//input[@id='continue']");
        Thread.sleep(2000);

        typeByXpath("//input[@id='ap_password']", "Nitish1!");
        clickByXpath("//input[@id='signInSubmit']");
        Thread.sleep(2000);
        driver.close();

    }
}
