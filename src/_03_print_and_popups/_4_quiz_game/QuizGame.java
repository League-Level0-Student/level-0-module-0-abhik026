package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		JOptionPane.showMessageDialog(null,"Welcome to Abhi's Quiz Show\n Ten Questions, 5 pts. for easy, 10pts. for hard\n "
				+ "You also lose 5 or 10 respectively for getting wrong answers\n ");
	
		
		int score = 0;
	//questions go here	
		String easy_question1 = JOptionPane.showInputDialog("What is 3+3?");
		String hard_question1 = JOptionPane.showInputDialog("How many countries in the world are there?(by UN  Standards");
		String easy_question2 = JOptionPane.showInputDialog("What is the capital of Canada?");
		String hard_question2 = JOptionPane.showInputDialog("What city has the greatest population(in the world)?");
		String easy_question3 = JOptionPane.showInputDialog("What event caused the starting of our galaxy?");
		/*
		 * (easy_question1, A1, easy_question2, A2, easy_question 3, A3)
		 * for(int i = 0; i<list.length()-2; i+=4){
		 * 	if list(i).equalsIgnoreCase(list(i+1)){
		 * 		score+=5;
		 * 	else{
		 * 		score-=5;
		 * }
		 * 	if(list(i+2).equalsIgnoreCase(i+3)){
		 *  score+=5;
		 *  else{
		 *  score-=5;
		 *  }
		 */
		if(easy_question1.equalsIgnoreCase("6")){
		score+=5 ;
		}
		else {
			
		score-=5;
		}

		int hq1 = Integer.parseInt(hard_question1);
		if(hq1>195 && hq1<200){
			score+=10 ;
			}
			else {
			score-=10;
			}
		
		if(easy_question2.equalsIgnoreCase("Ottawa")){
		score+=5 ;
		}
		else {
		score-=5;
		}
		

		if(hard_question2.equalsIgnoreCase("Tokyo")){
			score+=10 ;
			}
			else {
			score-=10;
			}
		
		if(easy_question3.equalsIgnoreCase("Big Bang")|| easy_question3.equalsIgnoreCase("The big bang")){
		score+=5 ;
		}
		else {
		score-=5;
		}
		
		JOptionPane.showMessageDialog(null,"Current Score: " + score+"pts.");

		
		String hard_question3 = JOptionPane.showInputDialog("What year did the Civil War begin?");
		String easy_question4 = JOptionPane.showInputDialog("What is the largest State by area?");
		String hard_question4 = JOptionPane.showInputDialog("What is the farthest a drive has ever gone?(golf in yards)");
		String easy_question5 = JOptionPane.showInputDialog("Who is the richest person in the world?");
		String hard_question5 = JOptionPane.showInputDialog("What is the world record 3x3 solve?(rubiks cube) in seconds");

		
		
		

		
		if(hard_question3.equalsIgnoreCase("1861")){
			score+=10 ;
			}
			else {
			score-=10;
			}
		
		if(easy_question4.equalsIgnoreCase("Alaska")){
		score+=5 ;
		}
		else {
		score-=5;
		}
		
		int hq4 = Integer.parseInt(hard_question4);

		if(hq4>499 && hq4<531){
			score+=10 ;
		}
			else {
			score-=10;
			}
		
		if(easy_question5.equalsIgnoreCase("Jeff Bezos")){
		score+=5 ;
		}
		else {
		score-=5;
		}
		
		float hq5 = Float.parseFloat(hard_question5);
		
		if(hq5>3.1 && hq5<4.1){
			score+=10 ;
			}
			else {
			score-=10;
			}
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		if(score<50) {
			JOptionPane.showMessageDialog(null,"Final Score: " + score+"pts. \n"+"Better Luck Next Time!");
		}
		else{
			JOptionPane.showMessageDialog(null,"Final Score: " + score+"pts. \n"+"That's Pretty good!");
		}
		System.out.println(score);
		
		
		
	}
}
