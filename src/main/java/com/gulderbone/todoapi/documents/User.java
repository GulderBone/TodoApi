package com.gulderbone.todoapi.documents;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
public class User {

  @Id
  private Long id;

  public String mail;

  public String password;

  public User(Long id, String mail, String password) {
    this.id = id;
    this.mail = mail;
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", mail='" + mail + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
