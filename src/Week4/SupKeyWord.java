package Week4;
class Fruits{
	void eat() {
		System.out.println("Eating Fruits");
	}
}
class Food extends Fruits {
	void mango() {
		super.eat();
		System.out.println("Eating Mango");
	}
	void apple() {
		System.out.println("Eating Apple");
	}
}
public class SupKeyWord {
	public static void main(String[] args) {
		Food d=new Food();
		d.mango();
		d.apple();
	}
}