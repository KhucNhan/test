package Buoi3;

import java.util.Objects;
import java.util.Scanner;

public class count_appear_string {
    public static void main(String[] args) {
        String[] wordArr;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something here:");
        String word = scanner.nextLine();

        wordArr = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordArr[i] = String.valueOf(word.charAt(i));
        }

        System.out.println("Enter a letter to search:");
        String letter = scanner.next();

        String index = "";

        for (int i = 0; i < word.length(); i++) {
            if (Objects.equals(letter, wordArr[i])) {
                count += 1;
                index += (i + 1) + " ";
            }
        }
        System.out.println("Letter " + letter + " appear " + count + " times at position " + index);
    }
}
