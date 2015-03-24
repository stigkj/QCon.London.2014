package opencrupt;

import lib.UI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {
    @Test
    public void testLeeting() {
        UI ui = Application.createUI();
        assertEquals("Leeted: Socrot", ui.leetMessage("Secret"));
    }
}