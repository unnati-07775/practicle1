import java.util.Scanner;

class College {
    String collegeName;

    // Constructor to initialize college name
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Non-static inner class
    class Admission {
        String studentName;
        String course;

        // Method to accept student details
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Enrolled: ");
            course = sc.nextLine();
        }

        // Method to display admission details
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        // Create object of outer class
        College college = new College("ABC Engineering College");

        // Create object of inner class
        College.Admission admission = college.new Admission();

        // Accept and display details
        admission.acceptDetails();
        admission.displayDetails();
    }
}