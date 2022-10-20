package string_related_example_programs;

import java.util.Arrays;

public class SubString_Example1 {
	public static void main(String[] args) {
		String s="Mahendra singh Dhoni";
		System.out.println("Original String: "+s);
		System.out.println("Substring starting from index 9: "+s.substring(9));
		System.out.println("substring starting from index 0 to 8: "+s.substring(0,8));
	}
}

class SubString_Example2{
	public static void main(String[] args) {
		String text=new String("Hello, my name, is yogesh");
		String[] sentences=text.split("\\.");
		System.out.println(Arrays.toString(sentences));
	}
}

