public class PatternCount {
    public static int countPatternOccurrences(int start, int end, String pattern) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (String.valueOf(i).contains(pattern)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start = 100, end = 1000;
        String pattern = "13";
        System.out.println("Occurrences of " + pattern + ": " + countPatternOccurrences(start, end, pattern));
    }
}
