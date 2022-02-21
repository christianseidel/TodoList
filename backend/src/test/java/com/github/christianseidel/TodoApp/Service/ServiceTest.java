package com.github.christianseidel.TodoApp.Service;

import com.github.christianseidel.TodoApp.Model.TodoItem;
import com.github.christianseidel.TodoApp.Repo.TodoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import javax.management.openmbean.OpenDataException;

import static com.github.christianseidel.TodoApp.Model.Status.OPEN;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    @Order(1)
    void newTodo() {
        // given
        TodoRepository repo = new TodoRepository();
        Service service = new Service(repo);
        TodoItem buyBread = new TodoItem("Brot kaufen", OPEN);
        TodoItem cleanEntranceHall = new TodoItem("Flur putzen", OPEN);
        // when
        service.createTodo(buyBread);
        service.createTodo(cleanEntranceHall);
        int arrayLength = repo.size();
        // then
        Assertions.assertEquals(2, arrayLength);
    }

    @Test
    void deleteTodo() {
        // given
        TodoRepository repo = new TodoRepository();
        Service service = new Service(repo);
        TodoItem buyBread = new TodoItem("Brot kaufen", OPEN);
        TodoItem cleanEntranceHall = new TodoItem("Flur putzen", OPEN);
        service.createTodo(buyBread);
        service.createTodo(cleanEntranceHall);
        // when
        service.deleteTodo(buyBread);
        int arrayLength = repo.size();
        // then
        Assertions.assertEquals(1, arrayLength);
        }


}