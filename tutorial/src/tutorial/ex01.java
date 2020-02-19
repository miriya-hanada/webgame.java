package tutorial;

public class ex01 {
	public static void main(String[] args) {

        int[] numbers = { 1, 4, 6, 9, 13, 16 };

        int oddSum = 0;
        int evenSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("Šï”‚Ì˜a‚Í" + oddSum + "‚Å‚·");
        System.out.println("‹ô”‚Ì˜a‚Í" + evenSum + "‚Å‚·");
    }
}