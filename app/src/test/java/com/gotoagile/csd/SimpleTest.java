package com.gotoagile.csd;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import course.labs.todomanager.ToDoItem;

public class SimpleTest {

    @Test
    public void doesNotExplode() throws Exception {
        ToDoItem todoItem = new ToDoItem("Titulo!", null, null, null);
        assertNotNull(todoItem.getTitle());
        assertNull(todoItem.getPriority());
    }
}