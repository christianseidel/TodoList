package com.github.christianseidel.TodoApp;

import com.github.christianseidel.TodoApp.Controller.Controller;
import com.github.christianseidel.TodoApp.Model.Status;
import com.github.christianseidel.TodoApp.Model.TodoItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoList {

    public static void main(String[] args) {
    SpringApplication.run(Controller.class, args);
    }

}
