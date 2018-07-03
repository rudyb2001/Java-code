
class CompoundInterestCalculator {

	public static void main(String[] args) {
		
		double amount;
		double principal = 10000;
		double rate = 0.01;
		String wordDay;
		
		for (int day = 0; day <= 20; day++) {
			amount = principal * Math.pow(1 + rate, day);
			if (day == 1) {
				wordDay = "day";
			} else {
				wordDay = "days";
			}
			System.out.println("Amount is: " + amount + " in " + day + " " + wordDay + ".");
		}
		
	}

}
