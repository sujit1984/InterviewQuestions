import java.util.Scanner;

public class AddBinary {

    public static String binarySum(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int str1Length = str1.length() - 1;
        int str2Length = str2.length() - 1;
        int carryFwd = 0;

        while (str1Length >= 0 || str2Length >= 0) {
            int sum = carryFwd;
            if (str1Length >= 0) {
                sum += str1.charAt(str1Length--) - '0';
            }

            if (str2Length >= 0) {
                sum += str2.charAt(str2Length--) - '0';
            }

            sb.insert(0, sum % 2);
            carryFwd = sum / 2;
        }

        if(carryFwd > 0 ){
            sb.insert(0,1);
    }
        return sb.toString();
   }
    public static void main(String[] args) {
        System.out.println("This is the new program");
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the 1st binary String: ");
        String str1 = sc.nextLine();
        //int a = integerValue(str1);
        System.out.println("Enter the 2nd binary String: ");
        String str2 = sc.nextLine();
        //int b = integerValue(str2);
        System.out.println("Sum of the two binary numbers is: " +binarySum(str1, str2));

    }
}
