import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class MyStaticFunctionsToClassMethodsTest {
    private MyStaticFunctionsToClassMethods _fixture;

    public MyStaticFunctionsToClassMethodsTest() {
        _fixture = new MyStaticFunctionsToClassMethods();
    }

    @Test 
    public void iterateScalars1DWithIndexes() {
        int[] expected = new int[] {0, 1, 2, 3, 4};
        int[] actual = _fixture.iterateScalars1DWithIndexes();
        //assertEquals(expected, actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void iterateScalars1DWithCollections() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = _fixture.iterateScalars1DWithCollections();
        assertTrue(actual.containsAll(expected));
    }
}
