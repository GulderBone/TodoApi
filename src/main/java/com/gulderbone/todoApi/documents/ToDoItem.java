package com.gulderbone.todoApi.documents;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class ToDoItem {

  @Id
  public Long id;

  public String title;

  public ToDoItem(Long id, String title) {
    this.id = id;
    this.title = title;
  }

  @Override
  public String toString() {
    return "ToDoItem{" +
        "id=" + id +
        ", title='" + title + '\'' +
        '}';
  }
}
