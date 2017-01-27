package params;

public class TwoGenDemo {
	public static void main(String[] args) {

		// In this case, Integer is substituted for T, and String is substitute
		// for V .
		TwoGen<Integer, String> twoGenForIntegers = new TwoGen<Integer, String>(104911249, "TRINADH KOYA");
		twoGenForIntegers.showTypes();

		int v = twoGenForIntegers.getObj1();
		System.out.println("Integr value stored by V " + v);
		String v1 = twoGenForIntegers.getObj2();
		System.out.println("String value stored by V1 " + v1);
		
		
		TwoGen<String, String> twoGenForString=new TwoGen<String, String>("TRINADH", "KOYA");
		String first_name,lastname;
		first_name=twoGenForString.getObj1();
		lastname=twoGenForString.getObj2();
		
		System.out.println(first_name);
		System.out.println(lastname);
		
		

	}

}
