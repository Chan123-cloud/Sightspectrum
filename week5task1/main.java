package week5task1;

public class main {

	public static void main(String[] args) {
		AbstractClass1 a = new ConcreteClass();  //Dynamic method dispatch
		a.eat();
		a.run();

	}

}
