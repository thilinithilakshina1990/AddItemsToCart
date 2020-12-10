package seleniumPractice1.Greencart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	public WebDriver intializeDriver() throws IOException {
		
		//Add externeral property file where all the browser and other details are stored
		Properties prop = new Properties();
		FileInputStream file= new FileInputStream("//Users//thilinigunarathna//eclipse-workspace//Greencart//src//main//java//seleniumPractice1//Greencart//data.properties");
		prop.load(file);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			//chrome driver code
			
			System.setProperty("webdriver.chrome.driver", "//Users//thilinigunarathna//Downloads//chromedriver 2");
			//WebDriver driver= new ChromeDriver(); --> Webdriver driver goes to global varaiable so that it does not need to define everywhere
			driver= new ChromeDriver();
			
			
		}
		
		else if(browserName.equals("firefox")) {
			
			//firefox code
		}
		
		//define implicit wait for whole code
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

}
