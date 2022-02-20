package com.github.christianseidel.TodoApp.Model;

public class TodoItem {

    public String todo;
    public Status status;

    public TodoItem (String todo, Status status) {
        this.todo = todo;
        this.status = status;
    }

    public TodoItem() {
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "todo='" + todo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
