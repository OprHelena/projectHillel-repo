package ua.ithillet.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Input the world: ");
        Scanner scanner = new Scanner(System.in);

        String wordUser = scanner.nextLine();
        String wordRandom = selectedWordByRandom(words);

        char[] array = new char[15];
        for (int i = 0; i < 15; i++) {
            array[i] = '#';
        }

        if (wordUser.equalsIgnoreCase(wordRandom)) {
            System.out.println("You guessed it! Congratulations!");

        } else if (wordUser.length() > wordRandom.length()) {
            for (int j = 0; j < wordRandom.length(); j++) {
                if (wordRandom.charAt(j) == wordUser.charAt(j)) {
                    array[j] = wordUser.charAt(j);
                }
            }

        } else if (wordUser.length() < wordRandom.length()) {
            for (int k = 0; k < wordUser.length(); k++) {
                if (wordUser.charAt(k) == wordRandom.charAt(k)) {
                    array[k] = wordUser.charAt(k);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }

    public static String selectedWordByRandom(String[] strArray) {
        Random random = new Random();
        int indexWord = random.nextInt(strArray.length);
        return strArray[indexWord];
    }
}

