package by.kvrnk.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        try {
            System.out.print("Enter a from 1 to 9, then press space: ");
            a = scanner.nextInt();

            System.out.print("Enter b from 1 to 9, then press space: ");
            b = scanner.nextInt();

            System.out.print("Enter c from 1 to 9, then press space: ");
            c = scanner.nextInt();

            ThreeDigitNumber threeDigitNumber = new ThreeDigitNumber(a, b, c);
            threeDigitNumber.showNoRepetitions(threeDigitNumber.getDigitNumber());

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Enter only number!");
        }
    }
}
