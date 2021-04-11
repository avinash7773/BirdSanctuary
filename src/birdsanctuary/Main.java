package birdsanctuary;

public class Main {
	public static void main(String[] args) {
		System.out.println("welcome birdsancatuary");
		
		BirdSanctuary birdSanctuaryManager = new BirdSanctuary();
		
		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Parrot parrot = new Parrot();
		Penguin penguin = new Penguin();
		
		birdSanctuaryManager.add(parrot);
		birdSanctuaryManager.add(duck);
		birdSanctuaryManager.add(duck2);
		birdSanctuaryManager.add(penguin);
		
		birdSanctuaryManager.printeatingbirds();
		birdSanctuaryManager. printflyablebirds();
		birdSanctuaryManager.printswimmablebirds();
		
		birdSanctuaryManager.remove(duck);
		birdSanctuaryManager.remove(parrot);
		
		System.out.println("Duck Count: " + Duck.count);
		System.out.println("Parrot Count: " + Parrot.count);
		System.out.println("Penguin Count: " + Penguin.count);

		
		
	}
}
