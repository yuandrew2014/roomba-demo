package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(800, 800);
		sleep(1500);
		driveDirect(0, 370);
		sleep(700);
		driveDirect(900, 900);
		sleep(1000);
		driveDirect(400, 0);
		sleep(700);
		driveDirect(900, 900);
		sleep(1100);
		driveDirect(0, 370);
		sleep(700);
		driveDirect(900, 900);
		sleep(1200);
		driveDirect(370, 0);
		sleep(700);
		driveDirect(500, 500);
	}

	public void loop() {

	}
}
