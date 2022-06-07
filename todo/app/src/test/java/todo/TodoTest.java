package todo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TodoTest {
  @Test
  public void StartsWithEmptyTodo() {
    Todo todo = new Todo();

    assertEquals("Starts with am empty todo", 0, todo.getTodos().size());
  }

  @Test
  public void AddTaskToTodo() {
    Todo todo = new Todo();
    todo.addTask("shopping");

    assertEquals("Add shopping task to todo list", 1, todo.getTodos().size());
  }

  @Test
  public void ContainsThreeTasks() {
    Todo todo = new Todo();
    todo.addTask("shopping");
    todo.addTask("doctor");
    todo.addTask("cleaning");

    assertEquals("Add shopping task to todo list", 3, todo.getTodos().size());
  }
}
