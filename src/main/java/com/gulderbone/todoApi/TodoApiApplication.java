package com.gulderbone.todoApi;

import com.gulderbone.todoApi.documents.ToDoItem;
import com.gulderbone.todoApi.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApiApplication implements CommandLineRunner {

    @Autowired
    private TodoItemRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(TodoApiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

//        repository.deleteAll();
//
//        repository.save(new ToDoItem(1L, "Take out the thrash"));
//        repository.save(new ToDoItem(2L, "Do something else"));
//        repository.save(new ToDoItem(3L, "Make a noise"));
//
//        System.out.println("Todo items found with findAll():");
//        System.out.println("-------------------------------");
//        for (ToDoItem toDoItem : repository.findAll()) {
//            System.out.println(toDoItem);
//        }
    }
}
