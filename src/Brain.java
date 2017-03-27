import processing.core.PApplet;

/***
 * This is the  class where the student will write their robot code.
 * 
 * @author keith
 *
 */
public class Brain extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("Processing");
	}

	public Brain(Roomba roomba) {
		super(roomba);
		this.roomba = roomba;
	}

	/**
	 * The initialize method will be called once at the start of the program.
	 * (think of "setup method in processing")
	 */
	public void initialize() {

		// drive direct will move the roomba and takes a wheelspeed
		driveDirect(-500, -500);

		// This will continue the last command for 2000 milliseconds.
		sleep(2000);

		// differing wheel speeds will cause the roomba to turn
		driveDirect(500, 200);
		sleep(1000);
	}

	/**
	 * The loop method repeats (think of the draw method)
	 */
	public void loop() {
		driveDirect(600, 500);
		if (isBumpedRight() || isBumpedLeft()) {
			// This code will execute if the roomba hits a wall
			driveDirect(-500, -500);
			sleep(1000);
		}
	}

}