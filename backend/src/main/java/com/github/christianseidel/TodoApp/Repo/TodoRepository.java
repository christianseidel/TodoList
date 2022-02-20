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

    public TodoItem getTodoItem (TodoItem){
        todoRepo.get
    }

    public void deleteTodoItem (TodoItem todo) {
        todoRepo.remove(todo);
    }

    public List<TodoItem> getTodos() {
        return todoRepo;
    }

    public int size() {
        return this.todoRepo.size();
    }

    @Override
    public String toString() {
        return "TodoRepository{" +
                "todoRepo=" + todoRepo +
                '}';
    }
}
