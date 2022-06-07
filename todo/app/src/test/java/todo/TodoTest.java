package todo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class TodoTest {
  @Test
  public void StartsWithEmptyTodo() {
    Todo todo = new Todo();
    System.out.println("running test");
    assertEquals("Starts with am empty todo", String.valueOf(""), todo);
    // assertEquals(Arrays.asList(""), todo);
  }
}
