import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");
        int marks[] = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        float percentage = (total / 500.0f) * 100;

        System.out.println("Total Marks is: " + total);
        System.out.println("Total Percentage is: " + percentage + "%");

        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 60) {
            grade = 'B';
        } else if (percentage >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("The student grade is: " + grade);
    }
}