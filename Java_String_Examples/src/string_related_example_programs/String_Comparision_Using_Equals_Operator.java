package string_related_example_programs;

public class String_Comparision_Using_Equals_Operator {
	public static void main(String[] args) {
		String s1="Sathyam";
		String s2="Sathyam";
		String s3=new String("Sathyam");
		System.out.println(s1==s2);//true, because both strings are same
		System.out.println(s1==s3);//false. here we are comparing data and reference or address
	}
}
