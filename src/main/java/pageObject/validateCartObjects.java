package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class validateCartObjects {

	public WebDriver driver;
	
	By cart= By.xpath("//a[@class='cart-icon']");
	
	//generating constructor
	public validateCartObjects(WebDriver driver2) {
		this.driver= driver2;
	}


	public WebElement getCart() {
		
		return driver.findElement(cart);
	}
	
	
}
