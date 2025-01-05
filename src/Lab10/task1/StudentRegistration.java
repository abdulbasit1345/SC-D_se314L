package Lab10.task1;

final class FailedStudent {
    private final int rollNumber;
    private final String subjectCode;
    private final String subjectName;

    public FailedStudent(int rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "Failed Student Details:\n" +
                "Roll Number: " + rollNumber + "\n" +
                "Subject Code: " + subjectCode + "\n" +
                "Subject Name: " + subjectName;
    }
}

// Mutable class for Promoted Students
class PromotedStudent {
    private int rollNumber;
    private String subjectCode;
    private String subjectName;

    public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Promoted Student Details:\n" +
                "Roll Number: " + rollNumber + "\n" +
                "Subject Code: " + subjectCode + "\n" +
                "Subject Name: " + subjectName;
    }
}


public class StudentRegistration {
    public static void main(String[] args) {
        FailedStudent failedStudent = new FailedStudent(101, "CS101", "Data Structures");
        System.out.println(failedStudent);

        // Attempting to modify failed student data would result in compilation error
        // failedStudent.setRollNumber(102); // This line would cause error

        System.out.println("-------------------");

        PromotedStudent promotedStudent = new PromotedStudent(201, "CS201", "Advanced Programming");
        System.out.println(promotedStudent);

        System.out.println("\nAfter modifying promoted student data:");
        promotedStudent.setSubjectCode("CS202");
        promotedStudent.setSubjectName("Web Development");
        System.out.println(promotedStudent);
    }
}
