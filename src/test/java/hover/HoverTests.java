package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTest {
    @Test
    public void testUser1(){
        var hoverPage = homePage.clickHover();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getCaptionTitle(),"name: user1","Caption title incorrect");
        assertEquals(caption.getCaptionLinkText(),"View profile","Caption link text incorrect");
        assertTrue(caption.getCaptionLink().endsWith("/users/1"),"Caption link Incorrect");
    }
}
