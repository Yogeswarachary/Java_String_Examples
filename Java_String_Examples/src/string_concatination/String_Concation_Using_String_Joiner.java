package string_concatination;

import java.util.StringJoiner;

public class String_Concation_Using_String_Joiner {
	public static void main(String[] args) {
		StringJoiner strjoin=new StringJoiner(", ");
		strjoin.add("Hai");
		strjoin.add("Hello");
		System.out.println(strjoin.toString());//displays result
	}
}
