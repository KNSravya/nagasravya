package PageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public WebDriver driver=null;
	BaseClass bc=new BaseClass();
@FindBy(xpath="//div[text()=\"Log in to Facebook\"]") 
WebElement loginHeader;

@FindBy(xpath="//input[@id=\"email\"]") 
WebElement email;
@FindBy(xpath="//input[@type=\"password\"]") 
WebElement pass;

@FindBy(xpath="//button[@type=\"submit\"]") 
WebElement loginbtn;


public LoginPage(WebDriver drive) {
	//this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public String getpropertyName() throws Exception{
	 return bc.getName();
	// System.out.println(name);
	 }
public void getLoginPageTitle() {
	String title=bc.getTitle();
	System.out.println(title);
}
public void getLoginPageText() {
	String title=bc.getText(loginHeader);
	System.out.println(title);
}
public void enterEmailAddress(String emailaddress) {
	bc.sendData(email,emailaddress);
	
}
public void enterPassword(String password) {
	bc.sendData(pass,password);
	
}
public void clickonLoginBtn() {
	clickoperation(loginbtn);
}



}
