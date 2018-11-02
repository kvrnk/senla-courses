package by.kvrnk.task2.Modules;

import java.util.ArrayList;
import java.util.List;

public class SequenceManager {
    private List<Integer> sequence = new ArrayList<>();

    public SequenceManager(int N) {
        fillSequence(N);
    }

    private void fillSequence(int N) {

        for (int i = 1; i <= N; i++) {
           sequence.add(i);
        }
    }

    public List<Integer> getEvenNumbers(List<Integer> sequence) {
        if (sequence == null) {
            sequence = new ArrayList<>();
        }

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : sequence) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        return evenNumbers;
    }

    public int getSum(List<Integer> sequence) {
       if(sequence == null) {
           sequence = new ArrayList<>();
       }

        int sum = 0;

        for (Integer evenNumber : sequence) {
            sum += evenNumber;
        }

        return sum;
    }

    public List<Integer> getSequence() {
        return sequence;
    }
}
