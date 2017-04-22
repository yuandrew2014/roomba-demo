package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * complete the MAZE Hint: use bump sensors
	 */

	public void initialize() {

		if (isBumpedLeft() == true) {
			driveDirect(0, 900);
			sleep(5000);
		} else {
			driveDirect(300, 300);
			sleep(1);

		}

	}

	public void loop() {

	}
}
