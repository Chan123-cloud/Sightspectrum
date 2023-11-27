package JavaPrograms3;

public class RemoveJunkandSpecial {

	public static void main(String[] args) {
		String a = "@#$%^&*()123456789dfhsgcnxbcnbkjsadkjas";
		a = a.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(a);
		

	}

}
