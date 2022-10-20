package string_related_example_programs;

public class String_Comparision_Using_Equals_Ignore {
	public static void main(String[] args) {
		String s1="Shyam";
		String s2="SHYAM";
		
		System.out.println(s1.equals(s2));//false
		//this below method gives true, if the both strings having the same name. except casing of two strings
		System.out.println(s1.equalsIgnoreCase(s2));//true
	}
}
