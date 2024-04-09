package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium\\FirstPro1\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");

	}

}
