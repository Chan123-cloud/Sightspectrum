package week5task2;

public class Main {

	public static void main(String[] args) {
		AbstractandAnonInnercCls a = new AbstractandAnonInnercCls() 
		{
			public void country() {
				System.out.println("INDIA");  // Abstract method
			}
		};
		a.country();
	

	
	AbstractandAnonInnercCls b = new AbstractandAnonInnercCls() 
	{
		public void citizen() {
			System.out.println("INDIAN");     // Concrete method
		}
	};
	b.citizen();
	
}
}
	
