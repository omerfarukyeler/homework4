package homeworks4;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		/*Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin 

          *  - Ilk harf buyuk harf olmali 
          *  - Son harf kucuk harf olmali 
          *  - Sifre bosluk icermemeli 
          *  - Sifre uzunlugu en az 8 karakter olmali
		  */
				
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Lutfen bir sifre giriniz =");
		
		String  sifre =scan.nextLine() ;
		
		if ( sifre.length()>=8 && ((sifre.charAt(0)>=65 && sifre.charAt(0)<=90))  &&
				
		   ((sifre.charAt(sifre.length()-1)>=97 && sifre.charAt(sifre.length()-1)<=122))&&
				
	       (!(sifre.contains(" ")))      )
					
		{
			
			System.out.println("Sifre basari ile tanimlandi");
						
		}
					
		else {
			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
		
		}
				
		
		}
		
		
					
					
		}
				
			
			
		

		
		
		
		
			

		
		
		
		
		
	


