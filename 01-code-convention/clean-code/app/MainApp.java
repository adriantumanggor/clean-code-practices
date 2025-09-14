package app;
import java.util.Scanner;
import input.InputHandler;
import output.Display;
import model.Student;
import service.GradeCalculator;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler input = new InputHandler(scanner);
        boolean continueCalculation = true;

        Display.showHeader();

        while (continueCalculation) {
            String studentName = input.getStudentName();
            double taskScore = input.getValidScore("Tugas");
            double utsScore = input.getValidScore("UTS");
            double uasScore = input.getValidScore("UAS");

            Student student = new Student(studentName, taskScore, utsScore, uasScore);

            double finalGrade = GradeCalculator.calculateFinalGrade(student);
            String letterGrade = GradeCalculator.determineLetterGrade(finalGrade);

            Display.showBreakdown(student);
            Display.showResult(student, finalGrade, letterGrade);

            continueCalculation = input.askForAnotherCalculation();
            if (continueCalculation) System.out.println();
        }

        scanner.close();
    }
}
