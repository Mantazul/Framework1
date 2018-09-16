package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonAPI {

   public WebDriver driver = null;
@BeforeMethod
public void setUP() {

    System.setProperty("webdriver.gecko.driver", "/Users/junedalam/Documents/framework1/Generic/Drivers/geckodriver 2");
    driver = new FirefoxDriver();
    String baseURL = "http://www.udemy.com";
    driver.manage().window().maximize();
    driver.get(baseURL);
}

@AfterMethod
    public void cleanUp(){
    driver.close();
}

}
