package de.readmore.demo;

import de.readmore.demo.wordcount.WordCounter;

import java.util.Map;
import java.util.Scanner;

public class WordCountApplication
{
    private static final String BY_SPACE = " ";

    public static void main(String[] args ) {
        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> wordCount = wordCounter.countWords(readUserInput().split(BY_SPACE));
        printWordCount(wordCount);
    }

    private static void printWordCount(Map<String, Integer> wordCount) {
        System.out.println(wordCount);
    }

    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your String:");
        return scanner.nextLine();
    }
}
