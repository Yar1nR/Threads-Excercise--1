package threads.exersice1;
import java.util.Scanner;
public class HorseRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enteer distance: ");
		int distance = input.nextInt();
		FinishingLine f = new FinishingLine();
		Horse h1 = new Horse("One", f, distance);
		Horse h2 = new Horse("Two", f, distance);
		Horse h3 = new Horse("Three", f, distance);
		Horse h4 = new Horse("Four", f, distance);
		Horse h5 = new Horse("Five", f, distance);
		Horse h6 = new Horse("Six", f, distance);
		Horse h7 = new Horse("Seven", f, distance);
		Horse h8 = new Horse("Eight", f, distance);
		Horse h9 = new Horse("Nine", f, distance);
		Horse h10 = new Horse("Ten", f, distance);
		
		h1.run();
		h2.run();
		h3.run();
		h4.run();
		h5.run();
		h6.run();
		h7.run();
		h8.run();
		h9.run();
		h10.run();
		
	}

}
