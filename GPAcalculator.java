import java.util.Scanner;

public class GPAcalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        double totalPoints = 0;
        
        // Loop to input grades for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + ": ");
            double grade = scanner.nextDouble();
            
            totalPoints += grade;
        }
        
        // Calculate GPA
        double gpa = totalPoints / numSubjects;
        
        // Display the result
        System.out.printf("Your GPA is: %.2f%n", gpa);
        
        // Close the scanner
        scanner.close();
    }
}
