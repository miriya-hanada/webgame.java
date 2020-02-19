package tutorial;

public class ex02 {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("何回入力しますか？");
        int input = scan.nextInt();
        int inputArray[] = new int[input];
        System.out.println("はい！"+input +"回入力しました！" );
        
        for ( int i = 0; i < inputArray.length; i++ ) {
            
            String str = scan.next();
            int count = 0;
            int sum = 0;
            String[] splitStr = str.split("");
            
            for( int j = 0; j < str.length(); j ++ ) {
                if ( splitStr[j].contains("x") ) {
                    count = 0;
                } else {
                    count++;
                    sum += count;
                }
            }
            System.out.println("SUM = " + sum);
        }
        System.out.println("おわりました！");
        
        scan.close();
    }
}
