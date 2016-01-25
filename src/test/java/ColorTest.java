import static junit.framework.TestCase.assertEquals;
import static org.junit.Test.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Taylor on 1/25/16.
 */
public class ColorTest {
    ColorfulThing colorTest;
    @Before
    public void assets() {
        colorTest = new ColorfulThing(ColorfulThing.Color.RED);
    }
    @Test
    public void getColorTest(){
        assertEquals("Assert that the color input is the same as color output","RED",colorTest.getColor());
    }
}
