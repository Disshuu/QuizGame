import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        // Array of questions
        String[] questions = {
            "1. Which of the following is not a java feature?",
            "2. Who is the inventor of Java programming language?",
            "3. Which of the following is used to find and fix bugs in java programs?",
            "4. What is the default value of a local variable in java?",
            "5. What is the size of an int variable in java?",
            "6. Which keyword is used to inherit a class in java?"
        };

        // 2D array of options
        String[][] options = {
            {"A. Object-oriented", "B. Portable", "C. Dynamic", "D. Use of pointers"},
            {"A. Dennis Ritchie", "B. James Gosling", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
            {"A. JVM", "B. JDK", "C. JRE", "D. JDB"},
            {"A. Null", "B. 0", "C. Depends on the variable type", "D. No default value"},
            {"A. 8 bits", "B. 16 bits", "C. 32 bits", "D. 64 bits"},
            {"A. super", "B. this", "C. 32 extends", "D. implements"}
        };

        // Correct answers
        char[] answers = {'D', 'B','D', 'D', 'C', 'C'};
        
        // Initialize score
        int score = 0;

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            // Print question
            System.out.println(questions[i]);

            // Print options
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            // Get the user's answer
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);

            // Check if the answer is correct
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }

            System.out.println();
        }

        // Print final score
        System.out.println("Quiz finished! Your final score is: " + score + "/" + questions.length);

        // Close scanner
        scanner.close();
    }
}
