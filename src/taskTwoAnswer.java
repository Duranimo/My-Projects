import java.util.Scanner;

public class taskTwoAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int secretNum = 1;
		int guessedNum;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Guess my secret number");
			guessedNum = scan.nextInt();
		} while (guessedNum != secretNum);
		
		System.out.println("You got it");
	}

}
