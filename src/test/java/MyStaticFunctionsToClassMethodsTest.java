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

    @Test
    public void equalityAndComparison() {
        Foo f1 = new Foo("foo 1", 100);
        Foo f2 = new Foo("foo 2", 200);

        // NLA. NOTE:  Will by default print @Override of toString()
        System.out.println("Before: ");
        System.out.println("  f1: " + f1);
        System.out.println("  f2: " + f2);

        // compare
        assertFalse(f1 == f2);
        assertFalse(f1.equals(f2));

        // reassign and compare again
        f1 = f2;
        System.out.println("After: ");
        System.out.println("  f1: " + f1);
        System.out.println("  f2: " + f2);

        assertTrue(f1 == f2);
        assertTrue(f1.equals(f2));

        assert(true);
    }

    @Test
    public void cloningAndComparison() {
        Foo f1 = new Foo("foo 1", 100);
        Foo f2 = new Foo("foo 2", 200);        

        System.out.println("Before: ");
        System.out.println("  f1: " + f1);
        System.out.println("  f2: " + f2);

        try {
            f2 = (Foo) f1.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Caught exception: " + e);
        }

        // compare
        assertFalse(f1 == f2);
        assertFalse(f1.equals(f2));

        // reassign and compare again
        f1 = f2;
        System.out.println("After: ");
        System.out.println("  f1: " + f1);
        System.out.println("  f2: " + f2);

        assertTrue(f1 == f2);
        assertTrue(f1.equals(f2));

        assert(true);
    }
}
