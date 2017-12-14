package fall2017;

public class MyStaticFunctionsToClassMethods {
    public int[] iterateScalars1DWithIndexes() {
		final int I_MAX = 5;
        int[] ints = new int[I_MAX];
		for (int i = 0; i < I_MAX; i++) {
            ints[i] = i;
			System.out.println(String.format("i: %d", i));
		}
        return ints;
    }
    public List<Integer> iterateScalars1DWithCollections() {
		List<Integer> someInts = new ArrayList<Integer>();
		someInts.add(new Integer(1));
		someInts.add(new Integer(2));
		someInts.add(new Integer(3));
		someInts.add(new Integer(4));
		someInts.add(new Integer(5));
		
		for(Integer anInt: someInts) {
			System.out.println(String.format("anInt: %d", anInt));
		}
        return someInts;
    }
}
