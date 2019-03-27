package com.gulderbone.todoapi;

import com.gulderbone.todoapi.repositories.UserRepository;
import com.gulderbone.todoapi.documents.ToDoItem;
import com.gulderbone.todoapi.documents.User;
import com.gulderbone.todoapi.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApiApplication implements CommandLineRunner {

  @Autowired
  private TodoItemRepository toDoItemrepository;

  @Autowired
  private UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodoApiApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {

//        toDoItemrepository.deleteAll();
//
//        toDoItemrepository.save(new ToDoItem(1L, "Take out the thrash"));
//        toDoItemrepository.save(new ToDoItem(2L, "Do something else"));
//        toDoItemrepository.save(new ToDoItem(3L, "Make a noise"));

    userRepository.save(new User(1L, "tomek@o2.pl", "1234"));
//
    System.out.println("Todo items found with findAll():");
    System.out.println("-------------------------------");
    for (ToDoItem toDoItem : toDoItemrepository.findAll()) {
      System.out.println(toDoItem);
    }

    System.out.println("Users found with findAll():");
    System.out.println("-------------------------------");
    for (User user : userRepository.findAll()) {
      System.out.println(user);
    }
  }
}
