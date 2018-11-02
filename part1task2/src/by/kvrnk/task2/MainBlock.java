package by.kvrnk.task2;

import by.kvrnk.task2.Modules.SequenceManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input N: ");
        Integer N = 0;
        try {
            N = scanner.nextInt();
        } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Input isn't a number!!!");
        }


        SequenceManager sequenceManager = new SequenceManager(N);

        System.out.println(sequenceManager.getEvenNumbers(sequenceManager.getSequence()).toString());
        System.out.print("Sum of even numbers: " + sequenceManager.getSum(sequenceManager.getEvenNumbers(sequenceManager.getSequence())));
    }
}
