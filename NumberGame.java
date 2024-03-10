package numbergame;
import javax.swing.*;
public class NumberGame {
 public static void main(String[] args) {
 int computerNumber = (int) (Math.random()*100 + 1);
 int userAnswer = 0;
 System.out.println("The correct guess would be " + computerNumber);
 int count = 1;
 while (userAnswer != computerNumber)
 {
 String response = JOptionPane.showInputDialog(null,
 "Enter a guess between 1 and 100", "Guessing Game", 3);
 if (response == null) {
 JOptionPane.showMessageDialog(null, "Game canceled.......Exiting?");
 System.exit(0);
 }
 try {
 userAnswer = Integer.parseInt(response);
 } catch (NumberFormatException e) {
 JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
 continue; 
 }
 JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, 
computerNumber, count));
 count++;
 }
 }
 public static String determineGuess(int userAnswer, int computerNumber, int 
count) {
 if (userAnswer <= 0 || userAnswer > 100) {
 return "Your guess is invalid";
 } else if (userAnswer == computerNumber) {
 return "Correct!\nYou have used Guesses: " + count;
 } else if (userAnswer > computerNumber) {
 return "Your guess is too HIGH, try Lower Values!!!\nTry Number: " + count;
 } else {
 return "Your guess is too LOW, try Higher Values!!!\nTry Number: " + count;
 }
 }
}