package com.takecian.hellospring;

public class Todo {

    private final long id;
    private final String content;

    public Todo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
