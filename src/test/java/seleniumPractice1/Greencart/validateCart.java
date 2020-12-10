package seleniumPractice1.Greencart;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.validateCartObjects;

public class validateCart extends HomePage {

	@Test

	public void validateCartItems() throws IOException {

		HomePage item = new HomePage();

		item.AdditemtoCart();

		// item.driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

		validateCartObjects cart = new validateCartObjects(item.driver);
		cart.getCart().click();

		List<WebElement> cartitems = item.driver
				.findElements(By.xpath("//div[@class='cart-preview active']//p[@class='product-name']"));
		System.out.println(cartitems.size());
		for (int i = 0; i < cartitems.size(); i++) {

			String addedItemName = cartitems.get(i).getText();
			System.out.println(addedItemName);

		}

		// item.driver.switchTo().activeElement();

		// String
		// cartitemsize=item.driver.findElement(By.xpath("/div[@class='cart-preview
		// active']/div[1]/div[1]/ul/li")).getText();
		// System.out.println(cartitemsize);
	}

}
