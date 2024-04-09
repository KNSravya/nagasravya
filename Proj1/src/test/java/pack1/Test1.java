package pack1;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageClass.LoginPage;

public class Test1{
	//private static final WebDriver driver = null;
	WebDriver driver;
	LoginPage lp=new LoginPage(driver);
	ExtentReports extentreport;
	ExtentSparkReporter htmlreport;
	ExtentTest testcase;
	@BeforeMethod
	public void beforeMetheod() {
		
		extentreport.createTest("verify test of before method");
		
		System.out.println("before method");
		
	}
	@BeforeClass
	public void beforeClass() {
		extentreport.createTest("verify before test");
		System.out.println("before class");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
		
	}
	@BeforeSuite
	public void beforeSuite() {
extentreport=new ExtentReports();
		
		htmlreport=new ExtentSparkReporter("report.html");
		extentreport.attachReporter(htmlreport);
		System.out.println("before suite");
		
	}
	@AfterSuite
	public void afterSuite() {
		extentreport.flush();
		System.out.println("after suite");
		
	}
	@Test
public void test1() throws Exception {
		String str=lp.getpropertyName();
		System.out.println(str);
		extentreport.createTest("verify 1 test");
		System.out.println("test method");
	}
	@Test
public void test2() {
		extentreport.createTest("verify 2 test");
		System.out.println("test2 method");
	}
	@Test
public void test3() {
		extentreport.createTest("verify 3 test");
		System.out.println("test3 method");
	}
	
	
	@AfterMethod
public void afterMetheod() {
		System.out.println("after method");
		
	}

}
