import java.util.Random;

class RandomNumberGenerator {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for (int counter = 0; counter <= 10; counter ++) {
			// 6 sides of a dice
			number = dice.nextInt(6) + 1;
			System.out.println(number + " ");
		}
	}
}
