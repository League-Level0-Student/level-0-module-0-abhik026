package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		Robot jeff = new Robot();
		// Create a new Robot
		jeff.penDown();
		
		jeff.setSpeed(100);
		
		// Set your robot's pen down 
		
		// SPEED. Set the robot to go at max speed (100)
		
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		for( int i = 0; i<50; i++ ) {
				// Change the robot pen color to random
			jeff.setRandomPenColor();
				// DRAW.    Move the robot (5*i) pixels
			jeff.move(5*i);
			jeff.turn(360/7);
		
			jeff.setPenWidth(i);
		}
			//          "i" is the variable in the for loop	
			
				// TURN.    Turn the robot (360/7) degrees to the right
			
				// Change the robot pen width to (i)

		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
