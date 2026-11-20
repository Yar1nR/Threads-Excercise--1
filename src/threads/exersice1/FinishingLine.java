//Yarin Rozilyo, 206519928 | Atawna Belal, 326309770 
package threads.exersice1;

//Manages the finishing order of the horses
public class FinishingLine {
	private int finish;
	
	public FinishingLine() {
		finish = 0;
	}
	
	// Synchronization ensures that horses are assigned
	// finishing positions one at a time
	public synchronized void arrive(Horse horse) {
	    finish++;

	    if (finish == 1) {
	        String border = "*".repeat(31);
	        System.out.printf("%s%n====> %s finished first!%n%s%n",
	                border, horse.getHorseName(), border);
	    } else {
	        System.out.println("====> " + horse.getHorseName()
	                + " finished on " + finish + "-th place");
	    }
	}
}
