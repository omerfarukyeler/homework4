package homeworks4;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		/*Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor” -
		 * isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” - 
		 * ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin.
		 */

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Isim giriniz= ");
		
		String isim1 = scan.nextLine();
		
		 isim1 = isim1.toUpperCase();
		
		
		
        if (isim1.contains("Z")) {
        	
        	System.out.println("Girdiginiz isim Z harfi iceriyor");
        }
        	
        else if (isim1.contains("A")) {
        	
        	System.out.println("Girdiginiz isim a harfi iceriyor ");
        }
        
        else {
        	
        	System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        	
        	
        }
		
		
		}
	    
			
		
		     
		     
		}

	


