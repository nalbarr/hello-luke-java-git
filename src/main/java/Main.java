public class Main {
    public static void main(final String[] args) {
        final MyStaticFunctionsToClassMethods instance = new MyStaticFunctionsToClassMethods();

        // NLA. NOTE:  This is the easiest way to get started.  However this will get out of control quickly as you add more 
        // functionality.
        AddTwoInts(1, 1);
        SubtractTwoInts(2, 1);

        // NLA. NOTE:  This start to break out code for modularity.
        instance.iterateScalars1DWithIndexes();
        instance.iterateScalars1DWithCollections();

        // NLA. NOTE here, best practice is to move object design and validation to test-driven development (TDD) tests.
        // Start looking under test/java/MyStaticFunctionsToClassMethodsTests.java
    }

    public static int AddTwoInts(int a, int b) {
        System.out.println("\n*** AddTwoInts.");

        int sum = a + b;
        System.out.println("a: " + a + " b: " + b + " (a + b): " + sum);
        return sum;
    }

    public static int SubtractTwoInts(int a, int b) {
        System.out.println("\n*** SubtractTwoInts.");

        int diff = a - b;
        System.out.println("a: " + a + " b: " + b + " (a - b): " + diff);
        return diff;        
    }
}