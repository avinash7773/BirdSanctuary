package birdsanctuary;

public class Duck extends Bird implements Swimmable,Flyable{
	static int count;
	public void swim() {
		System.out.println("duck can swim");
	}
	
	public void eat() {
		System.out.println("duck can eat");
	}
	
	public void fly() {
		System.out.println("duck can fly");
	}
	
	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void decrementCount() {
		count--;
	}
}
