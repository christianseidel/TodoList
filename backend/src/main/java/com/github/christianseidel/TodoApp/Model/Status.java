package com.github.christianseidel.TodoApp.Model;

public enum Status {
    open("offen"),
    started("begonnen"),
    closed("abgeschlossen");

    private String tag;

    Status (String tag) {
        this.tag = tag;
    }

    public String status() {
        return this.tag;
    }
}
