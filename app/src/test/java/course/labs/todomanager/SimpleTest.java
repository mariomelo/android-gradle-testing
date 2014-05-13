package course.labs.todomanager;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.mockito.Mockito;
import  android.test.ActivityUnitTestCase;

public class SimpleTest{

    @Test
    public void doesNotExplode() throws Exception {
        ToDoItem todoItem = new ToDoItem("Titulo", null, null, null);
        assertNotNull(todoItem.getTitle());
        assertNull(todoItem.getPriority());
        assert todoItem.toString() == "Titulo";
    }

}