import java.util.HashSet;

public class PerfectString {
    public static boolean isPerfectString(String input) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!charSet.add(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "absdhkqwertyuioplmnvczx";
        System.out.println("Is Perfect String: " + isPerfectString(input));
    }
}
