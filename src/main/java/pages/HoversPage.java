package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = new By.ByClassName("figure");
    private By caption = new By.ByClassName("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver=driver;
    }

    /***
     * hover over selected figure
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
         WebElement figure = driver.findElements(figureBox).get(index-1);
         Actions action = new Actions(driver);
         action.moveToElement(figure).perform();
         return new FigureCaption(driver.findElement(caption));
    }

    public class FigureCaption{
        WebElement caption;
        private By header = new By.ByTagName("h5");
        private By link = new By.ByTagName("a");

        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getCaptionText(){
            return caption.findElement(header).getText();
        }

        public String getCaptionLink(){
            return caption.findElement(link).getAttribute("href");
        }


    }


}
