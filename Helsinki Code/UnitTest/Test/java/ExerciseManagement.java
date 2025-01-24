package UnitTest.Test.java;
import java.util.ArrayList;
public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }
    public void add(String exercisess){
        this.exercises.add(new Exercise(exercisess));
    }
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: exercises){
            list.add(exercise.getName());
        }
        return list;
    }
    public void markAsCompleted(String exercise){
        for (Exercise ex: exercises){
            if (ex.getName().equals(exercise)){
                ex.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise){
        for (Exercise ex: exercises){
            if (ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}
