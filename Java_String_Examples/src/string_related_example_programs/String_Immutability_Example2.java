package string_related_example_programs;

public class String_Immutability_Example2 {
	public static void main(String[] args) {
		//creating a string using string literal
		String s="Mahendra singh ";
		
		//adding two strings using the concatination method
		s=s.concat("Dhoni");
		
		//printing the output string
		System.out.println(s);
	}
}

class TestingImmutabilityOfString{
	public static void main(String[] args) {
		String s="Mahendra singh";
		s.concat("Dhoni");
		System.out.println(s);
	}
}