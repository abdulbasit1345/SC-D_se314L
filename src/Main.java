import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter Total Marks: ");
            int totalMarks = scanner.nextInt();

            System.out.print("Enter Obtained Marks: ");
            int obtainedMarks = scanner.nextInt();

            // Calculate percentage, grade, and GPA
            double percentage = (double) obtainedMarks / totalMarks * 100;
            String grade;

            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            double gpa = percentage / 10;

            // Display mark sheet in a formatted manner
            System.out.println("\n\n-------------------- Mark Sheet --------------------");
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Obtained Marks: " + obtainedMarks);
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);
            System.out.printf("GPA: %.2f\n", gpa);
            System.out.println("----------------------------------------------------");
    }
}