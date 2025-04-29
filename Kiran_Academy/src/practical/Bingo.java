package practical;

import java.util.Scanner;

public class Bingo {
	
	Scanner scanner = new Scanner(System.in);
	
	// Function to check if a number contains the digit 7
  public static boolean containsDigitSeven(int number) {
        while (number > 0) {
            if (number % 10 == 7) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

   public void checkBingo() {

       System.out.print("Enter a number: ");
       int number = scanner.nextInt();

       // Check if the number is divisible by 7 and does not contain the digit 7
       if (number % 7 == 0 &&  !containsDigitSeven(number)) {
           System.out.println("The number is Bingo!");
       } else{
           System.out.println("The number is not Bingo.");
       }
   }
}


