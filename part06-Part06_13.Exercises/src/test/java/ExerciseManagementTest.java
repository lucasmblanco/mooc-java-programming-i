import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ExerciseManagementTest {
    private ExerciseManagement management;


    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());

    }

    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Write a text");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addingExerciseInList(){
        management.add("Write a text");
        assertTrue(management.exerciseList().contains("Write a text"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }

    @Test
    public void deleteAnExercise(){
        management.add("New exercise");
        management.deleteExercise("New exercise");
        assertEquals(0, management.exerciseList().size());
    }
}

