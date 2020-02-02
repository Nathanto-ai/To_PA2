
public class Encrypter {
	public static int[] encrypt (int [] digits) {
		int i, odds, evens;
		
		for(i=0; i < 4; i++) {
			digits[i] += 7;
			digits[i] = digits[i] % 10;
		}
		
		odds = digits[0];
		digits[0] = digits[2];
		digits[2] = odds;
		
		evens = digits[1];
		digits[1] = digits[3];
		digits[3] = evens;
		
				
		return digits;
	}
}
