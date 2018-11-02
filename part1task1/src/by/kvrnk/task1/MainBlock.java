package by.kvrnk.task1;

import by.kvrnk.task1.Modules.SentenceParser;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainBlock {
    public static void main(String[] args) {
        SentenceParser sentenceParser = new SentenceParser();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        List<String> words = sentenceParser.getWords(sentence);
        Collections.sort(words);


        System.out.println("Quantity of words: " + words.size());
        System.out.println(words.toString());
    }
}
