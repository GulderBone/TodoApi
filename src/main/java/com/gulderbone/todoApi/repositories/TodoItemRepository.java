package com.gulderbone.todoApi.repositories;

import com.gulderbone.todoApi.documents.ToDoItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoItemRepository extends MongoRepository<ToDoItem, String> {

    public ToDoItem findById(Long id);
}
