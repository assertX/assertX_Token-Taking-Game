package assignment_10;

import java.io.PrintWriter;
import java.util.ArrayList;




public class Game {
	// Data fields
	private int TARGET;
	private int turns;
	private ArrayList<Character> path;
	
	// Constructor
	public Game (int target, int turns) {
		this.TARGET = target;
		this.turns = turns;
		path = new ArrayList<>();
		
	}
	
	// Methods
	/**
	 * This method will use recursion to final the correct path to reach the token target in a certain amount of turns
	 * @param tokens: the token target of the current game
	 * @return: true if the current path is winner and return false if the current path is a loser.
	 */
	public boolean play(int tokens) { // Tokens = 75 and Turns = 6
		boolean result;
		// Base case.
		if (tokens == TARGET) {
			return true; // You win
		}
		else if (turns == 0) {
			return false; // Dead end
		}
		turns--;
		path.add('A');
		result = play(tokens + 39);
		if (result == true) {
			return true;
		}
		else { // A didnt work lets try B.
			path.remove(path.size() - 1);
			if (tokens % 2 == 0) {
				
				path.add('B');
				result = play(tokens / 2);
				if (result == true) {
					return true;
				}
				else { 
					path.remove(path.size() - 1);
					turns++;
					return false;
				}
			}
			else {// b is not an option
				turns++;
				return false;
			}
		}
	}
	/**
	 * write the final results to the output file.
	 * @param writer: the writer to output file.
	 */
	public void printResult(PrintWriter writer) {
		if (path.isEmpty()) {
			writer.println("Dead End");
		}else {
			for (int i = 0; i < path.size(); i++) {
				writer.print(path.get(i));
			}
		writer.println();
		}
	}
	

}
	
	
