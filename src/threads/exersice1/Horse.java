package threads.exersice1;

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
		System.out.printf("%-15s %s%n", name + ":", distance + " Meters to finish");
		while (distance > 0) {
			try {
				Thread.sleep(1000);
			}
			
			catch (Exception e) {
				System.out.println(e);
			}
			distance = Math.max(0,(distance - ((int)(Math.random()*20)+1)));
			System.out.printf("%-15s %s%n", name + ":", distance + " Meters to finish");
		}
		if (distance <= 0) 
				f.arrive(this);
		
	}
}
