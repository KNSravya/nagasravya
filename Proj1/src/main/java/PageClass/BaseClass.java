package PageClass;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	Properties properties=new Properties();
	//UtilityClass uc=new UtilityClass();
	public WebDriver driver;
	WebElement ele;
	public void openBrowser(String browser) throws IOException {
		
		//browser=uc.getBrowser();
		if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
			
		}
	}
//	public String getNa(String name) {
//		return name=uc.getName(name);
//		//System.out.println(name);
//	}
	public void propertiesFile() throws Exception {
		FileInputStream filepath=new FileInputStream("C:\\Automation\\Selenium\\Proj1\\Properties.properties");
		properties.load(filepath);
			
		}
	
	//FileInputStream filepath=new FileInputStream("C:\\Automation\\Selenium\\Proj1\\Properties.properties");
	//properties.load(filepath);
	public String getBrowser() throws IOException {
	//properties=new Properties();
	
	return properties.getProperty("browser");

}
	public String geturl() {
		return properties.getProperty("url");
		
	}
	public String getName() throws Exception {
		propertiesFile();
	 String str=properties.getProperty("name");
	 return str;
		
	}
//	public void launchUrl() {
//		driver.get(uc.geturl());
//	}
	
	public WebElement getElement(By locator) {
		return ele=driver.findElement(locator);
		
		
	}
	public String getTitle() {
		 return driver.getTitle();
		
	}
	
	
	public void sendData(WebElement ele,String str) {
		ele.clear();
		ele.sendKeys(str);
	}
	public void clickoperation(WebElement ele) {
		ele.click();
		
	}
	public String getText(WebElement ele) {
		return ele.getText();
		
	}

	
	
	

}
