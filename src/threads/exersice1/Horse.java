//Yarin Rozilyo, 206519928 | Atawna Belal, 326309770 
package threads.exersice1;

//Represents a horse running in a separate thread
public class Horse extends Thread {
	private String name;
	private FinishingLine f;
	private int distance;

	public Horse(String name, FinishingLine f, int distance) {
		this.name = name;
		this.f = f;
		this.distance = distance;
	}
	public String getHorseName() {
		return name;
	}
	@Override
	public void run() {
	    final String distanceFormat = "%-11s%d meters to finish%n";
	    System.out.printf(distanceFormat, name + ":", distance);

	    while (distance > 0) {
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            return;
	        }

	        int step = (int) (Math.random() * 20) + 1;
	        if (step >= distance) {
	            break;
	        }

	        distance -= step;
	        System.out.printf(distanceFormat, name + ":", distance);
	    }

	    synchronized (f) {
	        distance = 0;
	        f.arrive(this);
	    }
	}}