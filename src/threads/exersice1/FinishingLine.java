package threads.exersice1;

public class FinishingLine {
	private int finish;
	
	public FinishingLine() {
		finish = 0;
	}
	
	public void arrive(Horse horse) {
		if (finish == 0) {
			System.out.println("************************************");
			System.out.println(horse.getHorseName() + " finished first!");
			System.out.println("************************************");
			finish++;
		}
		else
			System.out.println("====> " + horse.getHorseName() + " finished on " + ++finish + "-th place");
	}
}
