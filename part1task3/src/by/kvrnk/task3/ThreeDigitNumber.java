package by.kvrnk.task3;

import java.util.Arrays;

public class ThreeDigitNumber {
    private int[] digitNumber = new int[3];

    public ThreeDigitNumber(int a, int b, int c) {
        fillThreeDigitNumber(a, b, c);
    }

    private void fillThreeDigitNumber(int a, int b, int c) {
        digitNumber = new int[]{a, b, c};
    }

    public void showNoRepetitions(int[] digitNumber) {
        for (int i = 0; i < digitNumber.length; i++) {
            for (int j = 0; j < digitNumber.length - 1; j++) {
                System.out.println(Arrays.toString(digitNumber));
                int tmp = digitNumber[j];
                digitNumber[j] = digitNumber[j+1];
                digitNumber[j+1] = tmp;
            }
        }

    }

    public int[] getDigitNumber() {
        return digitNumber;
    }
}
