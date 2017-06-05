package oop.object.model;

public class Student {
    
    private final String studentId;
    private final String studentName;
     Double score;
    
    // Default Constructor
    public Student() {
        this("-","-");
    }
            
    // Custom Constructor
    public Student(String studentId, String studentName) {        
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }        
}
