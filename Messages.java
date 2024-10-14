package W1.W1_BasicsRecapMoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < input; i++) {

            int number = Integer.parseInt(sc.nextLine());

            int startingNumber = number;

            int digitsCount = 0;

            int firstDigit = number % 10;

            while (number > 0) {
                number /= 10;
                digitsCount++;
            }

            int offset = (firstDigit - 2) * 3;

            if (firstDigit == 8) {
                offset++;
            } else if (firstDigit == 9) {
                offset++;
            }

            int index = offset + digitsCount;

            if (startingNumber == 0) {

                System.out.print(" ");
            } else {

                int magicFormula = 96 + index;
                System.out.print((char) magicFormula);
            }
        }
    }
}