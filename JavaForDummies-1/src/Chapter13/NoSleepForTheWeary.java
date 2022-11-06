package Chapter13;

import static java.lang.System.out;

public class NoSleepForTheWeary {
	public static void main(String args[]) throws InterruptedException {
		out.println("Taking nap");
		takeANap();
	}

	private static void takeANap() throws InterruptedException {
		Thread.sleep(5000);
		
	}
}
