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
        System.out.println("��̘a��" + oddSum + "�ł�");
        System.out.println("�����̘a��" + evenSum + "�ł�");
    }
}