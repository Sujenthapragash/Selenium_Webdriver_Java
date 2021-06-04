package keyPresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyPressesTests extends BaseTest {

    @Test
    public void testBackSpace(){
        var keyPress = homePage.clickKeyPresses();
        keyPress.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPress.getResult(),"You entered: BACK_SPACE","Result text incorrect");
    }

    @Test
    public void testPi(){
        var keyPress = homePage.clickKeyPresses();
        keyPress.enterPi();
        assertEquals(keyPress.getResult(),"4","Result test incorrect");
    }


}
