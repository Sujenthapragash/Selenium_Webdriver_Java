package dropDown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectOption (){
        var option = "Option 1";
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropdown(option);
        var selectOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectOptions.size(),1,"Incorrect Number of Selection");
        assertTrue(selectOptions.contains(option),"correct option is not Selected");
    }
}
