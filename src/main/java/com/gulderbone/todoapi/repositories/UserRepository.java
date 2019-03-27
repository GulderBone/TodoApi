package com.gulderbone.todoapi.repositories;

import com.gulderbone.todoapi.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

  public User findByMail(String mail);
}
