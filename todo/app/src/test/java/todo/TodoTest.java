package todo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TodoTest {
  @Test
  public void StartsWithEmptyTodo() {
    Todo todo = new Todo();
    System.out.println("running test");
    assertEquals("Starts with am empty todo", 0, todo.getTodos().size());
  }
}
