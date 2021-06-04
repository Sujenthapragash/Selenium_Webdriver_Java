package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPresses  {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");

    public KeyPresses(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        driver.findElement(inputField).sendKeys(Keys.chord(Keys.ALT,"p")+"=3.14");
    }

    public String getResult (){
        return driver.findElement(result).getText();
    }

}
