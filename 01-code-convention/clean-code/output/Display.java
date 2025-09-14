package output;

import model.Student;
import service.GradeCalculator;

public class Display {
    public static void showHeader() {
        System.out.println("=".repeat(60));
        System.out.println("     SISTEM PENGHITUNGAN NILAI MAHASISWA");
        System.out.println("=".repeat(60));
        System.out.println("Bobot Penilaian:");
        System.out.printf("- Tugas: %.0f%%\n", GradeCalculator.getTaskWeight() * 100);
        System.out.printf("- UTS  : %.0f%%\n", GradeCalculator.getUtsWeight() * 100);
        System.out.printf("- UAS  : %.0f%%\n", GradeCalculator.getUasWeight() * 100);
        System.out.println("=".repeat(60));
    }

    public static void showBreakdown(Student student) {
        System.out.println("\nBreakdown Perhitungan:");
        System.out.println("-".repeat(30));
        System.out.printf("Tugas: %.2f × %.2f = %.2f%n",
                student.getTaskScore(),
                GradeCalculator.getTaskWeight(),
                student.getTaskScore() * GradeCalculator.getTaskWeight());
        System.out.printf("UTS  : %.2f × %.2f = %.2f%n",
                student.getUtsScore(),
                GradeCalculator.getUtsWeight(),
                student.getUtsScore() * GradeCalculator.getUtsWeight());
        System.out.printf("UAS  : %.2f × %.2f = %.2f%n",
                student.getUasScore(),
                GradeCalculator.getUasWeight(),
                student.getUasScore() * GradeCalculator.getUasWeight());
        System.out.println("-".repeat(30));
    }

    public static void showResult(Student student, double finalGrade, String letterGrade) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("         HASIL PERHITUNGAN NILAI");
        System.out.println("=".repeat(50));
        System.out.printf("Nama Mahasiswa    : %s%n", student.getName());
        System.out.printf("Nilai Tugas       : %.2f%n", student.getTaskScore());
        System.out.printf("Nilai UTS         : %.2f%n", student.getUtsScore());
        System.out.printf("Nilai UAS         : %.2f%n", student.getUasScore());
        System.out.println("-".repeat(50));
        System.out.printf("Nilai Akhir       : %.2f%n", finalGrade);
        System.out.printf("Grade             : %s%n", letterGrade);
        System.out.println("=".repeat(50));
    }
}
