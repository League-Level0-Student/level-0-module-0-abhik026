package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		
		String question = JOptionPane.showInputDialog("What is 3+3?");
	
		if(question.equalsIgnoreCase("6")){
			JOptionPane.showMessageDialog(null,"Correct!");
		score+=10 ;
		}
		else {
			JOptionPane.showMessageDialog(null,"Sorry, that's wrong");
		score-=1;
		}
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		if(score<5) {
			JOptionPane.showMessageDialog(null,"Your Final Score is " + score+" \n"+"Better Luck Next Time!");
		}
		else{
			JOptionPane.showMessageDialog(null,"Your Final Score is " + score+" \n"+"That's Pretty good!");
		}
	}
}
