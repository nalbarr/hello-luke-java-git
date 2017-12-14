package fall2017;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyStaticFunctionsToClassMethodsTest {
    private MyStaticFunctionsToClassMethods _fixture;

    public MyStaticFunctionsToClassMethodsTest() {
        _fixture = new MyStaticFunctionsToClassMethods();
    }

    @Test 
    public void iterateScalars1DWithIndexes() {
        expected int[] = new int[] {1, 2, 3, 4, 5};
        actual = _fixture.iterateScalars1DWithIndexes();
        assertEquals(expected, actual);
    }

    @Test
    public void iterateScalars1DWithCollections() {
        expected List = Arrays.asList(1, 2, 3, 4, 5);
        actual = _fixture.iterateScalars1DWithCollections();
        assertTrue(actual.containsAll(expected));
    }
}
