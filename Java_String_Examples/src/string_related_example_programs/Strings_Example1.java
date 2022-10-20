package string_related_example_programs;

public class Strings_Example1 {
	public static void main(String[] args) {
		
		//creating a string using string literal
		String s1="Welcome";
		
		//Creating the characters array
		char ch[]= {'t','o','t','h','e','w','o','r','l','d'};
		
		//converting char array to string
		String s2=new String(ch);
		
		//creating a string using the new keyword
		String s3=new String("Example");
		
		//printing the above values
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
