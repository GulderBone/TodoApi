package com.gulderbone.todoapi.repositories;

import com.gulderbone.todoapi.documents.ToDoItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoItemRepository extends MongoRepository<ToDoItem, Long> {

    public ToDoItem findByTitle(String title);
}
