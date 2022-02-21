package com.github.christianseidel.TodoApp.Service;

import com.github.christianseidel.TodoApp.Model.TodoItem;
import com.github.christianseidel.TodoApp.Repo.TodoRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class Service {

    public TodoRepository todoRepo;

    public Service(TodoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }

    public void createTodo(@RequestBody TodoItem todo) {
        todoRepo.createTodoItem(todo);
    }

    public TodoItem getTodo(@RequestBody TodoItem todo) {
        todoRepo.getTodo(todo);
    }


    public void deleteTodo(TodoItem todo) {
        todoRepo.deleteTodoItem(todo);
    }


}
