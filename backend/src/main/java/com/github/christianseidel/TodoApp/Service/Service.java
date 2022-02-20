package com.github.christianseidel.TodoApp.Service;

import com.github.christianseidel.TodoApp.Model.TodoItem;
import com.github.christianseidel.TodoApp.Repo.TodoRepository;

public class Service {

    private final TodoRepository todoRepo;

    public Service(TodoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }

    public void createTodo(TodoItem todo) {
        todoRepo.createTodoItem(todo);
    }


}
