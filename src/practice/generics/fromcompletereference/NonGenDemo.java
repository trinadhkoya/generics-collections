package practice.generics.fromcompletereference;

public class NonGenDemo {

	public static void main(String[] args) {
		// Create NonGen Object and store
		NonGen gen;
		// an Integer in it. Autoboxing still occurs
		gen = new NonGen(88);
		// Show the type of data used by gen.
		gen.showType();
		// Get the value of gen.
		// This time, a cast is necessary.
		int v = (int) gen.getObject();
		System.out.println("value: " + v);
		// Create another NonGen object and
		// store a String in it.
		NonGen gen2 = new NonGen("Non-Genric Test");
		// Show the type of data used by gen2.
		gen2.showType();
		// This time also, a cast is necessary.
		String v1 = (String) gen2.getObject();
		
		gen=gen2;// This compiles, but is conceptually wrong!
		v=(Integer) gen.getObject();
	}
}
