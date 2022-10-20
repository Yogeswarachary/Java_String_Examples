package string_concatination;

public class String_Concation_Using_Join_Method {
	public static void main(String[] args) {
		
		String s1=new String("Hello");
		String s2=new String("world");
		String s3=String.join(" ",s1,s2);
		System.out.println(s3.toString());
	}
}
