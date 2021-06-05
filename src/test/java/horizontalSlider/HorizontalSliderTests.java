package horizontalSlider;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTest {
    @Test
    public void testSliderRange(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSlider();
        assertEquals(horizontalSliderPage.getSliderRange(),"1.5","Slider range incorrect");
    }
}
