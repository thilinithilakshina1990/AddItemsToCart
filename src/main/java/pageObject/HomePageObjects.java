package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	public WebDriver driver;

	By allProductNames = By.xpath("//h4[@class='product-name']");
	By addtocart = By.xpath("//div[@class='product-action']/button");
	
	By brocoliadd= By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]");


	//generated constructor
	public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

public List<WebElement> getAllProductNames() {
	return driver.findElements(allProductNames);
}

public List<WebElement> getaddtocartbutton() {
	
	return driver.findElements(addtocart);
}

public WebElement getBrocoliAddButton() {
	
	return driver.findElement(brocoliadd);
}


}
