
public class Decrypter {
	public static int[] decrypt (int [] ddigits) {
		int i, odds, evens;
		
		odds = ddigits[0];
		ddigits[0] = ddigits[2];
		ddigits[2] = odds;
		
		evens = ddigits[1];
		ddigits[1] = ddigits[3];
		ddigits[3] = evens;
		
		for(i=0; i < 4; i++) {
			if(ddigits[i] <= 6) {
				ddigits[i] = ddigits[i] + 10;
			}
			ddigits[i] -= 7;
		}
		
		return ddigits;
	}
}
