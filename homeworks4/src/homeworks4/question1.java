package homeworks4;

public class question1 {

	public static void main(String[] args) {
		
	/*String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  
	 *string ifadesini “Java ogrenmek cok guzel.” sekline getirin.
	 */
		
		String test = "Java ogrenmek123 Cok guzel@ "  ;
		
        test  = test.replaceAll("\\d","" );
		
	    test = test.replaceAll(" C", " c");		
		
		
     	System.out.println(test.replaceAll("@" , ""));
		
		 
		
		
		
		
		
		
	

	}

}
