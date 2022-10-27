/**
 * 
 */
package medaviebc_fan;

/**
 * 
 * @author Jennifer Savard
 * Thursday, October 27, 2022
 * Medavie Blue Cross coding assessment
 * 
 */

import static medaviebc_fan.Direction.CLOCKWISE;
import static medaviebc_fan.Direction.COUNTERCLOCKWISE;

public class Fan {

	// Create speed variable and getter
	private int speed = 0;
	public int getSpeed() {
		return speed;
	}
	
	// Create direction variable and getting
	private Direction direction = CLOCKWISE;
	public Direction getDirection() {
		return direction;
	}
	
	// Increase speed. When increased, if speed equals 4, reset speed to 0
	public void changeSpeed() {
		speed++;
		if (speed == 4) {
			speed = 0;
		}
	}
	
	// Reverse direction.
	public void changeDirection() {
		switch(direction){
		case CLOCKWISE:
			direction = COUNTERCLOCKWISE;
			break;
		case COUNTERCLOCKWISE:
			direction = CLOCKWISE;
			break;
		}
	}
	
	// Override toString method
	@Override
	public String toString() {
		return String.format("The fan is on %d speed and is going in a %s direction", speed, direction);
	}
}

// Create an enum with direciton options
enum Direction {
	CLOCKWISE,
	COUNTERCLOCKWISE;
}
