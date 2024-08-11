package algorithms;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseStr("hello World!"));
		System.out.println(reverseStr2("hello World!"));
	}

	public static String reverseStr(final String str) {
		char[] arrStr = str.toCharArray();
		StringBuffer buff = new StringBuffer(arrStr.length);
		for (int i = arrStr.length; i > 0; i--) {
			buff.append(arrStr[i-1]);
		}
		return buff.toString();
	}
	
	public static String reverseStr2(final String str) {
		StringBuffer buff = new StringBuffer(str.length());
		for (int i = str.length(); i > 0; i--) {
			buff.append(str.substring(i-1, i));
		}
		return buff.toString();
	}

}
