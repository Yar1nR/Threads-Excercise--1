package threads.exersice1;

public class Horse extends Thread {
	public String name;
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
		while (distance > 0) {
			try {
				Thread.sleep(1);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.printf("%-15s %s%n", name + ":", distance + " Meters to finish");;
			distance =- ((int)(Math.random()*20)+1);
		}
		if (distance <= 0) 
			synchronized (this) {
				f.arrive(this);
			}
	}
}
