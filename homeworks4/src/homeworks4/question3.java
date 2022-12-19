package homeworks4;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
		
		/*Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
	     */
		 
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Isim giriniz =");		
	
		String isim = scan.nextLine();
	
		System.out.println("Soyisim giriniz =");
		
		String soyisim = scan.nextLine();
        
		
		
		if ( isim.length()> soyisim.length()) {
			
			System.out.println("isim uzunlugu daha fazladır.");
			
		}	
			
			
		else if (isim.length() < soyisim.length()) {
			
			System.out.println("soyisim uzunlugu daha fazladir");
			
		}
		
		else {
			
			System.out.println("isim ve soyisim uzunlugu esittir.");
			
		}
	
	}

}
