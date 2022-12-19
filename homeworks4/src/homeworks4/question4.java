package homeworks4;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		
	/*Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin.
         *isim-soyisim : O*** K***** 
         */  
		  		 
	Scanner  scan = new Scanner (System.in);
		
	System.out.println("Isminiz giriniz =");
		
        String isim = scan.nextLine();
         
        System.out.println("Soyisminizi giriniz = ");  

        String soyisim = scan.nextLine() ;
        
        System.out.println("16 haneli kart no giriniz =");
        
        String kartno =scan.nextLine();
        
     
               
        System.out.println("isim-soyisim="+isim.substring(0, 1)+"*".repeat(isim.length()-1)+ soyisim.substring(0, 1)+ "*".repeat(soyisim.length()-1));
        
        
        System.out.println("kart no = "+"*".repeat(kartno.length()-8) + kartno.subSequence(12, 16) );
	}

}
