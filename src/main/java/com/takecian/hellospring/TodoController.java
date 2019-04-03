package com.takecian.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping("/todo")
    public Todo get() {
        return todoService.get();
    }
}
