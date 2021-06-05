package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.tagName("input");
    private By sliderRange = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSlider(){
        driver.findElement(slider).sendKeys(Keys.chord(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT));
    }

    public String getSliderRange(){
        return driver.findElement(sliderRange).getText();
    }

}
