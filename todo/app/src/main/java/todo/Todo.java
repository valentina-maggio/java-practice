package todo;

import java.util.ArrayList;

public class Todo {

  private ArrayList<String> todos = new ArrayList<>();

  public ArrayList<String> getTodos() {
    return this.todos;
  }

  public void addTask(String task) {
    this.todos.add(task);
  }
}
