package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class DragAndDropPage {

	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "draggable")
	public static WebElement element1;
	@FindBy(how = How.ID, using = "droppable")
	public static WebElement element2;

	public DragAndDropPage() {
		PageFactory.initElements(Setup.driver, this);

	}
	/* Create methods */

	public void goToURL(String url) {
		Setup.driver.get(url);

	}

	public void selectioneElement1() {
		element1.click();
	}

	public void selectioneElement2() {
		element2.click();
	}

	public void dragAndDropAction() {
		Actions action = new Actions(Setup.driver);
		action.dragAndDrop(element1, element2).perform();
	}

}
