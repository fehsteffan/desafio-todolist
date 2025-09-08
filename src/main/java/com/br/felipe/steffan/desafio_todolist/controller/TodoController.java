package com.br.felipe.steffan.desafio_todolist.controller;


import com.br.felipe.steffan.desafio_todolist.entity.Todo;
import com.br.felipe.steffan.desafio_todolist.service.TodoService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todos")
public class TodoController {

    public TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);

    }

    @GetMapping
    public List<Todo> list() {
        return todoService.list();
    }

    @PutMapping
    public List<Todo> upDate(@RequestBody Todo todo) {
        return todoService.update(todo);

    }

    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);
    }



}
