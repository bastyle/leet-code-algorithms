package algorithms;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		final String binaryNumber = Integer.toBinaryString(number);
		System.out.println(binaryNumber);
		int longestGap = 0, auxGap=1;
		
		for (int i = 1; i < binaryNumber.length(); i++) {			
			if (binaryNumber.charAt(i) == '0') {
				auxGap++;
				continue;
			} else {
				longestGap = (auxGap>longestGap?auxGap:longestGap);
				auxGap=1;//reset
			}
		}
		
		System.out.println(longestGap);
	}

}
