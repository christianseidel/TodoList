package com.github.christianseidel.TodoApp.Service;

import com.github.christianseidel.TodoApp.Model.TodoItem;
import org.junit.jupiter.api.Test;

import static com.github.christianseidel.TodoApp.Model.Status.OPEN;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void newTodo() {
        // given
        TodoItem buyBread = new TodoItem("Brot kaufen", OPEN);
        Service.createTodo(buyBread);
        // when


    }
}