package tutorial3;

public class ex01_answer {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        int check = input;
        int count = 1;

        while(true) {
            int number_10 = input/10;
            int number_1 = input%10;
            int numberSum = number_10 + number_1;
            input = number_1*10 + numberSum%10;
            if (check == input) {
                break;
            } else {
                count++;
            }

        }
        System.out.println(count);
    }
}