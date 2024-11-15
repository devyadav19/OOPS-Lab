import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the frequency threshold: ");
        int threshold = scanner.nextInt();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Characters exceeding threshold:");
        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) > threshold) {
                System.out.println(c + ": " + frequencyMap.get(c));
            }
        }
    }
}
