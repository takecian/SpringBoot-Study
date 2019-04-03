package com.takecian.hellospring;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    public Todo get() {
        return new Todo(1, "name name");
    }
}
