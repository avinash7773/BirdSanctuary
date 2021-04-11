package birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuary {
	List<Bird> birdList = new ArrayList();
	
	public void add(Bird bird) {
		birdList.add(bird);
		bird.incrementCount();
	}
	
	public void remove(Bird bird) {
		birdList.remove(bird);
		bird.decrementCount();
	}
	
	public void printeatingbirds() {
		for(Bird bird : birdList) {
			bird.eat();
//			if(bird instanceof Duck)
//				((Duck) bird).eat();
//			else if(bird instanceof Parrot)
//				((Parrot) bird).eat();
		}
	}
	
	public void printflyablebirds() {
		for(Bird bird : birdList) {
			if(bird instanceof Flyable) {
				((Flyable)bird).fly();
			}
		}
	}
	
	public void printswimmablebirds() {
		for(Bird bird : birdList) {
			if(bird instanceof Swimmable) {
			((Swimmable)bird).swim();
			}
		}
	}
	
	
}
