package SelLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) 
	{
		System.setProperty( "webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        driver.get("https://infornexus-rctp.qa.gtnexus.com/");
        System.out.println("Execution completed1");
        System.out.println("Execution completed2");
        System.out.println("Execution completed2");
        System.out.println("Execution completed5");
        driver.quit();
        

	}

}
