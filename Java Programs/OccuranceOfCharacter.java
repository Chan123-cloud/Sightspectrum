package JavaPrograms3;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String a ="Apple is very taste" ;
		
		int count = 0 ;
		
		for(int i =0 ; i<a.length() ; i++) {
			
			if( a.charAt(i) =='e' ) {
		     count ++;
			}
				
			}
		System.out.println(count);
		}

	}

