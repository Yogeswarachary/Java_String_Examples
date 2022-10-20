package string_related_example_programs;

public class String_Comparision_Using_CompareTo {
	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Sachin";
		String s3="Ratan";
		
		//compareTo() gives you zero if both strings are equal
		System.out.println(s1.compareTo(s2));
		
		//compareTo() gives you one if String one is greater than string two
		System.out.println(s1.compareTo(s3));
		
		//compareTo() gives you -1 if String one is less than the string two
		System.out.println(s3.compareTo(s1));
	}
}
