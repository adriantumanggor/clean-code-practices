package input;

import java.util.Scanner;
import service.GradeCalculator;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getStudentName() {
        System.out.print("Masukkan nama mahasiswa: ");
        return scanner.nextLine();
    }

    public double getValidScore(String scoreName) {
        double score;
        while (true) {
            System.out.printf("Masukkan nilai %s (%.0f-%.0f): ",
                    scoreName,
                    GradeCalculator.getMinScore(),
                    GradeCalculator.getMaxScore());

            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                scanner.nextLine();     
                if (GradeCalculator.isValidScore(score)) {
                    break;
                } else {
                    System.out.printf("Error: Nilai harus dalam rentang %.0f-%.0f!\n",
                            GradeCalculator.getMinScore(),
                            GradeCalculator.getMaxScore());
                }
            } else {
                System.out.println("Error: Masukkan nilai berupa angka!");
                scanner.next();
            }
        }
        return score;
    }

    public boolean askForAnotherCalculation() {
        System.out.print("\nApakah Anda ingin menghitung nilai mahasiswa lain? (y/n): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("y") || response.equals("yes");
    }
}

