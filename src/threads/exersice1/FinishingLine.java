package threads.exersice1;

public class FinishingLine {
	private int finish;
	
	public FinishingLine() {
		finish = 0;
	}
	
	public synchronized void arrive(Horse horse) {
		if (finish == 0) {
			System.out.println("************************************\n" +
					horse.getHorseName() + " finished first!" +
					"\n************************************");
			finish++;
		}
		else
			System.out.println("====> " + horse.getHorseName() + " finished on " + ++finish + "-th place");
	}
}
