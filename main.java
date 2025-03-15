public class Student{
    private String name;
    private String studentID;
    private int score;
    public Student(String name,String studentID,int score){
        this.name=name;
        this.studentID=studentID;
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public String getStudentID(){
        return studentID;
    }
    public int getScore(){
        return score;
    }
}
import java.util.Scanner;
public class ScoreQuerySystm{
    private Student student;
}