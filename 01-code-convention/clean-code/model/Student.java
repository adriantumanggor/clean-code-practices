package model;

public class Student {
    private String name;
    private double taskScore;
    private double utsScore;
    private double uasScore;
    
    public Student(String name, double taskScore, double utsScore, double uasScore) {
        this.name = name;
        this.taskScore = taskScore;
        this.utsScore = utsScore;
        this.uasScore = uasScore;
    }
    
    public String getName() {
        return name;
    }
    
    public double getTaskScore() {
        return taskScore;
    }
    
    public double getUtsScore() {
        return utsScore;
    }
    
    public double getUasScore() {
        return uasScore;
    }
}
