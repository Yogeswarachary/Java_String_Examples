package string_related_example_programs;

public class String_Comparision_Using_Equals1 {
	public static void main(String[] args) {
		String s1="Bumra";
		String s2="Bumra";
		String s3=new String("Bumraa");
		String s4="surya kumar";
		
		//comparing the above strings with each and everyone
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
