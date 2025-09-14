# 📌 Ide Studi Kasus Clean Code Practice (Pertemuan 01 – Code Convention)

### Judul: Sistem Penghitungan Nilai Mahasiswa Sederhana

Buatlah program Java untuk menghitung nilai akhir mahasiswa berdasarkan komponen:

- Tugas (30%)
- UTS (30%)
- UAS (40%)

### Spesifikasi Program
1. Program menerima input:
   - Nama mahasiswa
   - Nilai Tugas, UTS, dan UAS
2. Program menghitung nilai akhir menggunakan bobot.

### 🎯 Aturan yang wajib dipatuhi mahasiswa
- **Class** → menggunakan PascalCase (contoh: `Student`, `GradeCalculator`, `MainApp`).
- **Method & variabel** → gunakan camelCase (`calculateFinalGrade`, `finalGrade`, `studentName`).
- **Konstanta** → gunakan UPPER_SNAKE_CASE (T`ASK_WEIGHT`, U`TS_WEIGHT`, `UAS_WEIGHT`).
- Indentasi → **4 spasi** (setara dengan 1 tab), konsisten.
- Nama file harus sama dengan **public class**.
- **Kurung kurawal** → dibuka di baris yang sama.
- **File name** ↔ public class harus sama.



/**
 * Sistem Penghitungan Nilai Mahasiswa Sederhana
 * Program ini menghitung nilai akhir mahasiswa berdasarkan komponen:
 * - Tugas (30%)
 * - UTS (30%) 
 * - UAS (40%)
 */
public class StudentGradeCalculator {
    // Konstanta untuk nilai maksimal dan minimal
    private static final double MAX_SCORE = 100.0;
    private static final double MIN_SCORE = 0.0;

    /**
     * Method untuk validasi input nilai
     * @param score nilai yang akan divalidasi
     * @return true jika nilai valid (0-100)
     */
    public static boolean isValidScore(double score) {
        return score >= MIN_SCORE && score <= MAX_SCORE;
    }

    /**
     * Method untuk menampilkan hasil perhitungan
     */
    public static void displayResult(Student student, double finalGrade, String letterGrade) {
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