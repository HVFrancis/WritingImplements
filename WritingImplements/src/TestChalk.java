package src;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestChalk.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestChalk
{
    /**
     * Default constructor for test class TestChalk
     */
    public TestChalk()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void ChalkMaking()
    {
        src.Chalk chalk1 = new src.Chalk("Plastic", "Yellow", 20);
        src.Chalk chalk2 = new src.Chalk("Wooden", "Blue", 23);
        src.Chalk chalk3 = new src.Chalk();
    }
}

