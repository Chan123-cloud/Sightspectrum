package week5task2;

public class Main3 {

	public static void main(String[] args) {
		E1num s = E1num.sunday;//If else method for give some Instructions
        if(s == E1num.sunday) {
        	System.out.println("HOLIDAY");
        }
        else if(s==E1num.monday) {
        	System.out.println(" 1st WORKING DAY");
        }
        else if(s==E1num.tuesday) {
        	System.out.println("2nd WORKING DAY");
        		
        	}
        else {
        	System.out.println("CONTINIOUS WORKING DAY");
        }
	}
	

}