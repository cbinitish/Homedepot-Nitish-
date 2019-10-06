package alibabalogin;

import base.CommonAPI;
import org.testng.annotations.Test;

public class signinvalues extends CommonAPI {
@Test
    public void signvalue() throws InterruptedException {

    clickByXpath("//div[@class='sc-hd-ms-login']");
    sleepFor(3);
    typeByXpath("//input[@id='fm-login-id']","cbinitish@gmail.com");
    typeByXpath("//input[@id='fm-login-password']","gokugame0009");

    clickByXpath("//input[@id='fm-login-submit']");
}
}
