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
		driveDirect(800,800);
		sleep(700);
driveDirect(0,180);
sleep(1400);
driveDirect(1600,1600);
sleep(2900);
driveDirect(180,0);
sleep(1400);
driveDirect(800,800);
sleep(1300);
driveDirect(180,0);
sleep(1400);
driveDirect(1600,1600);
sleep(1000);
driveDirect(0,180);
sleep(1400);
driveDirect(800,800);
sleep(700);
driveDirect(0,180);
sleep(1400);
driveDirect(800,800);
sleep(600);
driveDirect(180,0);
sleep(1400);
driveDirect(800,800);
sleep(400);
driveDirect(0,180);
sleep(1400);
driveDirect(800,800);
sleep(1000);



	}

	public void loop() {
		
	}
}
