import java.util.Scanner;

class QuizManager {

    Question[] questions;
    int score = 0;

    // Constructor to initialize questions
    public QuizManager() {

        questions = new Question[3];

        questions[0] = new Question(
                "Q1: What is Java?",
                new String[]{
                        "a) Programming Language",
                        "b) Operating System",
                        "c) Database",
                        "d) Browser"
                },
                "a"
        );

        questions[1] = new Question(
                "Q2: What is OOP?",
                new String[]{
                        "a) Open Operating Platform",
                        "b) Object-Oriented Programming",
                        "c) Output Operation Process",
                        "d) None"
                },
                "b"
        );

        questions[2] = new Question(
                "Q3: Which keyword is used to create object in Java?",
                new String[]{
                        "a) create",
                        "b) object",
                        "c) new",
                        "d) make"
                },
                "c"
        );
    }

    // Method to start quiz
    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            questions[i].displayQuestion();

            System.out.print("Enter your answer: ");
            String answer = sc.nextLine();

            if (answer.equals(questions[i].correctAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Final Score: " + score + "/" + questions.length);
    }
}