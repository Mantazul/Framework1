import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {

    @Test
    public  void search(){
        driver.findElement(By.id("header-search-field")).sendKeys("selenium");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
