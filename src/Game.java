import java.util.Scanner;
import java.util.Random;
public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(99)+1;
		int humanNumber = 0;
		System.out.println("Enter a presumed number between(1-100)");
		
		do {
			humanNumber = 0;
			try {
				humanNumber = scanner.nextInt();
			}catch(Exception e) {
				System.out.println("Please enter a correct number");
				scanner.next();	// clearing the wrong input
				continue;
			}
			if(humanNumber > number)
				System.out.println("Less");
			else if(humanNumber < number)
				System.out.println("Bigger");
		} while(humanNumber != number);
		scanner.close();
		System.out.println("Numbers are equal!");
	}
}
