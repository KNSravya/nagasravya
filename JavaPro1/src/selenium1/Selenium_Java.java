package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Java {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\JavaPro1\\driver\\chromedriver.exe");// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");
	}

}
