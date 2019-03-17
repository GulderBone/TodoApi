package com.gulderbone.todoApi.controllers;

import com.gulderbone.todoApi.documents.ToDoItem;
import com.gulderbone.todoApi.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoItemController {

    @Autowired
    TodoItemRepository repository;

    @CrossOrigin
    @RequestMapping("/items")
    public List<ToDoItem> toDoItem() {
        return repository.findAll();
    }
}
