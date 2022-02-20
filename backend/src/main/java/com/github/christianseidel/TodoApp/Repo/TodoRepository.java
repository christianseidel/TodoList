package com.github.christianseidel.TodoApp.Repo;

import com.github.christianseidel.TodoApp.Model.TodoItem;

import java.util.ArrayList;
import java.util.List;

public class TodoRepository {

    private List<TodoItem> todoRepo = new ArrayList<>();

    public TodoRepository() {
      this.todoRepo = new ArrayList<>();
    }

    public void createTodoItem (TodoItem todo) {
        todoRepo.add(todo);
    }

    public List<TodoItem> getTodos() {
        return todoRepo;
    }
}
