import java.util.Scanner;

enum Result {
    CORRECT, WRONG, NOT_ANSWERED
}

class QuizGrader {
    private char[] correctAnswers = {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};

    public void gradeQuiz(char[] submittedAnswers) {
        System.out.println("QUESTION | SUBMITTED ANS | CORRECT ANS | RESULT");
        int score = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            char submitted = (i < submittedAnswers.length) ? submittedAnswers[i] : 'X';
            Result result = (submitted == 'X') ? Result.NOT_ANSWERED
                    : (submitted == correctAnswers[i]) ? Result.CORRECT : Result.WRONG;

            if (result == Result.CORRECT) score++;

            System.out.printf("%8d | %14c | %12c | %s%n", i + 1, submitted, correctAnswers[i], result);
        }

        System.out.println("\nFinal Score: " + score + "/8");
        System.out.println("Result: " + (score >= 5 ? "Passed" : "Failed"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your answers for the quiz (8 questions, A/B/C/D):");
        char[] submittedAnswers = new char[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Answer for Question " + (i + 1) + ": ");
            submittedAnswers[i] = scanner.next().toUpperCase().charAt(0);

            while (submittedAnswers[i] != 'A' && submittedAnswers[i] != 'B'
                    && submittedAnswers[i] != 'C' && submittedAnswers[i] != 'D') {
                System.out.print("Invalid input! Please enter A, B, C, or D: ");
                submittedAnswers[i] = scanner.next().toUpperCase().charAt(0);
            }
        }

        new QuizGrader().gradeQuiz(submittedAnswers);

        scanner.close();
    }
}