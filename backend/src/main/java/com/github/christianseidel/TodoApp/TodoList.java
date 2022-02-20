package com.github.christianseidel.TodoApp;

import com.github.christianseidel.TodoApp.Model.Status;
import com.github.christianseidel.TodoApp.Model.TodoItem;

public class TodoList {

    public static void main(String[] args) {
        String b = "Putzen";
        System.out.println(new TodoItem(b, Status.OPEN));

    TodoItem machmal = new TodoItem("Lachen", Status.STARTED);
        System.out.println(machmal);
    }

}
