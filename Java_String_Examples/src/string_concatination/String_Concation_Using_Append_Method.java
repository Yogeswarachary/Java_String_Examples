
package string_concatination;

public class String_Concation_Using_Append_Method {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Hello ");
		StringBuilder s2=new StringBuilder("World");
		StringBuilder s3=s1.append(s2);//String3 stores the result
		System.out.println(s3);
	}
}
