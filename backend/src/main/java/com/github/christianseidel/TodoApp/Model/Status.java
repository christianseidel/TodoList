package com.github.christianseidel.TodoApp.Model;

public enum Status {
    OPEN("offen"),
    STARTED("begonnen"),
    CLOSED("abgeschlossen");

    private String tag;

    Status (String tag) {
        this.tag = tag;
    }

    public String status(String state) {
        return tag;
    }
}
