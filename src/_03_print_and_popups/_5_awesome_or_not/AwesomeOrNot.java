package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;
import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int random = ran.nextInt(4);

		// 3. Print your variable to the console

		System.out.println(random);
	
		// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("What is something you think is awesome?");
		// 5. If your variable is  0
	if (random == 0) {
		JOptionPane.showMessageDialog(null, "That is Awesome!");
	}
			// -- tell the user whatever they entered is awesome!
	
	if (random == 1) {
		JOptionPane.showMessageDialog(null, "That's OK");
	}
	
	if (random == 2) {
		JOptionPane.showMessageDialog(null, "That's boring");
	}
	
	if (random == 3) {
		JOptionPane.showMessageDialog(null, "That is weird");
	}// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).

}
}