package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage (WebDriver driver){
        this.driver=driver;
    }

    public void selectFromDropdown(String option){
        Select dropdownElement = new Select(driver.findElement(dropdown));
        dropdownElement.getAllSelectedOptions();
    }

}
