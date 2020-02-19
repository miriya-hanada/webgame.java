package tutorial3;

public class ex01 {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();

        int number_10 = input / 10;
        int number_1 = input % 10;


        int count = 0;
        int sum = number_10 + number_1;


        while(true) {
            System.out.println("sum => " + sum + " = " + number_10+ " + " + number_1 );
            int sum_number_10 = sum % 10;
            System.out.println("sum_number_10 == " + sum_number_10);
            int newSum = number_1 + sum_number_10;
            System.out.println("newSum => " + newSum + " = " + number_1+ " + " + sum_number_10);
            System.out.println("count = " + count);
            System.out.println("");


            if (sum ==  newSum) {
                break;
            } else {
            count++;
            }
        }
    }
}
