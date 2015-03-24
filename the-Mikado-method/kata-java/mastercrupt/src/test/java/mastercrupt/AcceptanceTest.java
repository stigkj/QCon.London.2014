package mastercrupt;

import lib.UI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class AcceptanceTest {
    @Test
    public void testLeeting() {
        UI ui = Application.createUI();
        assertEquals("Leeted: S3cr3t", ui.leetMessage("Secret"));
    }
}