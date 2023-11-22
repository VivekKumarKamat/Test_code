import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task A: Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
        List<Integer> arrayA = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            arrayA.add(i);
        }
        Collections.shuffle(arrayA);
        System.out.println("Shuffled Array: " + arrayA);

        // Task B: Enter a Roman Number as input and convert it to an integer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanInput = scanner.nextLine().toUpperCase();
        int integerOutput = romanToInteger(romanInput);
        System.out.println("Converted Integer: " + integerOutput);

        // Task C: Check if the input is a pangram or not.
        System.out.print("Enter a sentence: ");
        String sentenceInput = scanner.nextLine();
        if (isPangram(sentenceInput)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    // Helper method for Task B: Convert Roman numeral to integer.
    private static int romanToInteger(String roman) {
        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentSymbol = roman.charAt(i);
            int currentValue = romanToInteger(currentSymbol);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    private static int romanToInteger(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral symbol: " + symbol);
        }
    }

    // Helper method for Task C: Check if the input is a pangram.
    private static boolean isPangram(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (lowerCaseSentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
//output
//Shuffled Array: [3, 6, 1, 7, 2, 4, 5]
//Enter a Roman Number: v
//Converted Integer: 5
//Enter a sentence: 