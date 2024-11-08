import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle r = new Rectangle();

        while (true) {
            try {
                System.out.println("\n1. Set Length \n2. Set Width \n3. Display Rectangle \n4. Exit \nChoice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter length of rectangle: ");
                        double length = input.nextDouble();
                        r.setLength(length);
                        break;

                    case 2:
                        System.out.print("Enter width of rectangle: ");
                        double width = input.nextDouble();
                        r.setWidth(width);
                        break;

                    case 3:
                        r.display();
                        break;

                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Clear the invalid input
            }
        }
    }
}







//Task 1
//Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter Student Name: ");
//String studentName = scanner.nextLine();
//
//            System.out.print("Enter Total Marks: ");
//int totalMarks = scanner.nextInt();
//
//            System.out.print("Enter Obtained Marks: ");
//int obtainedMarks = scanner.nextInt();
//
//// Calculate percentage, grade, and GPA
//double percentage = (double) obtainedMarks / totalMarks * 100;
//String grade;
//
//            if (percentage >= 90) {
//grade = "A+";
//        } else if (percentage >= 80) {
//grade = "A";
//        } else if (percentage >= 70) {
//grade = "B";
//        } else if (percentage >= 60) {
//grade = "C";
//        } else if (percentage >= 50) {
//grade = "D";
//        } else {
//grade = "F";
//        }
//
//double gpa = percentage / 10;
//
//// Display mark sheet in a formatted manner
//            System.out.println("\n\n-------------------- Mark Sheet --------------------");
//            System.out.println("Student Name: " + studentName);
//            System.out.println("Total Marks: " + totalMarks);
//            System.out.println("Obtained Marks: " + obtainedMarks);
//            System.out.printf("Percentage: %.2f%%\n", percentage);
//            System.out.println("Grade: " + grade);
//            System.out.printf("GPA: %.2f\n", gpa);
//            System.out.println("----------------------------------------------------");