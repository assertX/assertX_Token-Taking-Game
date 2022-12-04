package assignment_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
public static void main(String[] args) throws IOException {
		
		// Open input and output files.
		FileInputStream inputFile = new FileInputStream("games.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("result.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		
		// Read the input file and run the game.
		while (scanner.hasNextInt()) {
			int tokens = 27;
			int target = scanner.nextInt();
			int turns = scanner.nextInt();
			
			// Each separate line in the input file is 1 game.
			Game newGame = new Game(target, turns);
			newGame.play(tokens);
			newGame.printResult(writer);
		}
		
		// Close input and output files.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
	}
}
