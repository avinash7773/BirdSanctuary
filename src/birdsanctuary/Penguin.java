package birdsanctuary;

public class Penguin extends Bird implements Swimmable {
	static int count;
	public void swim() {
		System.out.println("penguin can swim");
	}
	
	public void eat() {
		System.out.println("penguin can eat");
	}
	
	public int getCount() {
		return count;
	}
	
	public void incrementCount() {
		count++;
	}

	public void decrementCount() {
		count--;
	}
}
