package com.gulderbone.todoApi.documents;

import org.springframework.data.annotation.Id;

public class ToDoItem {

    @Id
    public Long id;

    public String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ToDoItem(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
