import models.RandomNames;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomNamesTest {

    private RandomNames names;

    @Before
    public void before() {
        names = new RandomNames("Emma", "Sarah");
    }

    @Test
    public void hasName1() {
        assertEquals("Emma", names.getName1());
    }

    @Test
    public void hasName2() {
        assertEquals("Sarah", names.getName2());
    }

}
