package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * Without touching the wall reach the endZone use sleep an driveDirect
	 */
	public void initialize() {
		// write code here!
		driveDirect(999, 999);
		sleep(1000);
		driveDirect(0, 370);
		sleep(1000);
		driveDirect(900, 900);
		sleep(4000);
		driveDirect(0, 370);
		sleep(900);
		driveDirect(999, 999);
	}

	public void loop() {

	}
}
