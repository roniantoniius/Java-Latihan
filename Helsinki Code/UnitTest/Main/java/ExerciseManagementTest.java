package UnitTest.Main.java;
import org.junit.Test;
import org.junit.Assert.assertEquals;
import org.junit.Assert.assertTrue;

import UnitTest.Test.java.ExerciseManagement;
public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void intialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseEmptyAtBeginning(){
        // menghitung size dari listnya harus kosong
        assertEquals(0, managament.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Tuliskan your todo list today");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void tambahTugasKhusus(){
        management.add("Tol0ng,tulis.15@|   `4%6re");
        assertTrue(management.exerciseList().contains("Tol0ng,tulis.15@|   `4%6re"));
    }

    @Test
    public void exerciseBisaDitandaiSelesai(){
        management.add("Tugas baru berhasil!");
        management.markAsCompleted("Tugas baru berhasil!");
        assertTrue(management.isCompleted("Tugas baru berhasil!"));
    }
    
    @Test
    public void exerciseTidakBisaDitandaiSelesai(){
        management.add("Tugas baru berhasil!");
        management.markAsCompleted("Tugas baru berhasil!");
        assertFalse(management.isCompleted("Tugas baru berhasil!"));
    }
}
