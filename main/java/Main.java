package fall2017;

public class Main {
    public static void main(final String[] args) {
        final MyStaticFunctionsToClassMethods instance = new MyStaticFunctionsToClassMethods();
        
        instance.iterateScalars1DWithIndexes();
        instance.iterateScalars1DWithCollections();
        instance.iterateInterfaces1DWithCollections();
    }
}