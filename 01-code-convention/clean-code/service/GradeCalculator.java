package service;

import model.Student;

public class GradeCalculator {
    private static final double TASK_WEIGHT = 0.30;
    private static final double UTS_WEIGHT = 0.30;
    private static final double UAS_WEIGHT = 0.40;

    private static final double MAX_SCORE = 100.0;
    private static final double MIN_SCORE = 0.0;

    public static double calculateFinalGrade(Student student) {
        return (student.getTaskScore() * TASK_WEIGHT) +
                (student.getUtsScore() * UTS_WEIGHT) +
                (student.getUasScore() * UAS_WEIGHT);
    }

    public static String determineLetterGrade(double finalGrade) {
        if (finalGrade >= 85)
            return "A";
        else if (finalGrade >= 70)
            return "B";
        else if (finalGrade >= 55)
            return "C";
        else if (finalGrade >= 40)
            return "D";
        else
            return "E";
    }

    public static boolean isValidScore(double score) {
        return score >= MIN_SCORE && score <= MAX_SCORE;
    }

    public static double getTaskWeight() {
        return TASK_WEIGHT;
    }

    public static double getUtsWeight() {
        return UTS_WEIGHT;
    }

    public static double getUasWeight() {
        return UAS_WEIGHT;
    }

    public static double getMaxScore() {
        return MAX_SCORE;
    }

    public static double getMinScore() {
        return MIN_SCORE;
    }
}
