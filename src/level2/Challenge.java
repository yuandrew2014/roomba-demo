package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(900, 900);
		sleep(1500);
		driveDirect(0, 370);
		sleep(800);
		driveDirect(900, 900);
		sleep(2500);
		driveDirect(370, 0);
		sleep(750);
		driveDirect(900, 900);
	}

	public void loop() {

	}
}
