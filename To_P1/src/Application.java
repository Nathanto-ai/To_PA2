import java.util.*;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		boolean loop = true;
		
		while(loop) {
			System.out.println("01. Encrypt");
			System.out.println("02. Decrypt");
			System.out.println("03. Quit");
			
			int ch = sc.nextInt();
			switch(ch) {
				
				case 1:
					int [] digits = new int[4];
					
					System.out.println("Enter the four digits you want encrypted separated by spaces.");
					
					for(int i=0; i<4; i++) {
						digits[i] = sc.nextInt();

					}
					
					int[] result = Encrypter.encrypt(digits);
					
					System.out.println("Your encrypted integers are.");
					System.out.println(Arrays.toString(result));
					
					break;
				case 2:
					int [] ddigits = new int[4];
					
					System.out.println("Enter the numbers you want decrypted separated by spaces");
					
					for(int i=0; i<4; i++) {
						ddigits[i] = sc.nextInt();
					}
					int[] decryptedresult = Decrypter.decrypt(ddigits);
					
					System.out.println("Your decrypted integers are.");
					System.out.println(Arrays.toString(decryptedresult));

					break;
				case 3: loop = false;
				break;
				default:System.out.println("Wrong Entry");
					
			}
		}
		sc.close();
		System.exit(0);
	}
}

