package seleniumPractice1.Greencart;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.HomePageObjects;

//inheriting the base class to home page 

public class HomePage extends base {

	@Test
	public void AdditemtoCart() throws IOException {

		driver = intializeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemNeeded = { "Brocolli", "Cucumber", "Tomato" };

		HomePageObjects l = new HomePageObjects(driver);

		List<WebElement> products = l.getAllProductNames();

		for (int i = 0; i < products.size(); i++) {

			String[] x = products.get(i).getText().split("-");
			String formattedName = x[0].trim();
			List<String> itemsneeded = Arrays.asList(itemNeeded);

			System.out.println(formattedName);

			if (itemsneeded.contains(formattedName)) {

				l.getaddtocartbutton().get(i).click();
				;

				System.out.println(x);

			}

			else {

				System.out.println("No item found");
			}

		}

	}

}
