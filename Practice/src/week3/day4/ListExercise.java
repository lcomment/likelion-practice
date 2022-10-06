package week3.day4;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("lcomment");
    }

    public List<String> getStudents(){
        return students;
    }
}
