package com.WebApp.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class quickLinks {

	@Test(priority=3)
	public void Electronics(){
		WebElement electro = HomePage.getDriver().findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
		electro.click();
		if(electro.isSelected()){
			System.out.println("electro is clicked");
		} else{
			System.out.println("No Link for Electronics found.");
		}
		WebElement cellPhone = HomePage.getDriver().findElement(By.partialLinkText("HTC One M8 Android L"));
		cellPhone.click();
		String expectedText = "HTC One M8 Android L 5.0 Lollipop";
		String actualText= cellPhone.getText();

		if(actualText.equals(expectedText)){
			System.out.println("Yes"+ actualText);
		} else
		{
			System.out.println("NOPE" + actualText);
		}


	}
}
