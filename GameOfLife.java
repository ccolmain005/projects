import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GameOfLife {
	static boolean[][] current;
	static boolean[][] next;
	static int generations;

	static void readBoard(String file_name) {
		Scanner input;
		int rows;
		int columns;
		String line;

		try {
			input = new Scanner(new File(file_name));

			generations = input.nextInt();

			rows = input.nextInt();
			columns = input.nextInt();
			input.nextLine();

			current = new boolean[rows + 2][columns + 2];
			next = new boolean[rows + 2][columns + 2];
			for (int row = 0; row < current.length; row++) {
				for (int column = 0; column < current[row].length; column++) {
					current[row][column] = false;
					next[row][column] = false;
				}
			}

			// Read in the data
			for (int row = 0; row < rows; row++) {
				line = input.nextLine();
				for (int column = 0; column < columns; column++) {
					// Place in center area leaving boundaries clear
					current[row + 1][column + 1] = ('*' == line.charAt(column));
				}
			}

			input.close();

		} catch (IOException caught) {
			System.out.println("Error: Error while reading file! "
					+ file_name);
			System.out.println(caught);
			caught.printStackTrace();
		}

	}

	static void nextGeneration() {
		boolean[][] temporary;
		int neighbours;

		for (int row = 1; row < current.length - 1; row++) {
			for (int column = 1; column < current[row].length - 1; column++) {
				neighbours = 0;
				for (int dx = 0; dx < 3; dx++) {
					for (int dy = 0; dy < 3; dy++) {
						if (current[row + dx - 1][column + dy - 1]) {
							neighbours = neighbours + 1;
						}
					}
				}

				if (current[row][column]) {
					neighbours = neighbours - 1;
				}

				switch (neighbours) {
				case 0:
				case 1:
					next[row][column] = false;
					break;
				case 2:
					next[row][column] = current[row][column];
					break;
				case 3:
					next[row][column] = true;
					break;
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
					next[row][column] = false;
					break;
				default:
					next[row][column] = false;
					assert (false);
					break;
				}
			}
		}
		temporary = current;
		current = next;
		next = temporary;
	}
	static void printBoard(PrintStream output) {

		for (int row = 0; row < current.length; row++) {
			for (int column = 0; column < current[row].length; column++) {
				if (current[row][column]) {
					output.print('*');
				} else {
					output.print('.');
				}
			}
			output.println();
		}
		output.close();
	}
	
	public static void main(String[] arguments) {
		long start;
		long end;
		PrintStream output;

		readBoard(arguments[0]);

		if (2 < arguments.length) {
			generations = Integer.parseInt(arguments[2]);
		}

		start = System.nanoTime();
		for (int generation = 0; generation < generations; generation++) {
			nextGeneration();
		}
		end = System.nanoTime();

		System.out.printf("Runtime was %.6f\n",
				((double) (end - start)) / 1.0E6d);

		try {
			if (1 < arguments.length) {
				output = new PrintStream(arguments[1]);
			} else {
				output = System.out;
			}

			printBoard(output);

			if (output != System.out) {
				output.close();
			}

		} catch (IOException caught) {
			System.err.println("Error");
		}
	}
}