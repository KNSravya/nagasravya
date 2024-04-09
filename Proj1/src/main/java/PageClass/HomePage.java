package PageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass{
	WebElement ele=driver.findElement(By.xpath("/input[@id=\"email\"]"));

}
