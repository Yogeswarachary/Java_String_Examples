package string_concatination;

public class String_Concation_Using_Concatination_Operator1 {
	public static void main(String[] args) {
		//below line code. before string literal numbers are calculated as addition
		//After the string literal the numbers are also treated as the string.
		String s= 20+50+"Raghava"+20+70;
		System.out.println(s);//70Raghava2070
	}
}
