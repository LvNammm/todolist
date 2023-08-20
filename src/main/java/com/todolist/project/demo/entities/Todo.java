package com.todolist.project.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    public static AtomicInteger autoId = new AtomicInteger();
    private Integer id;
    private String title;
    private Boolean status;
    public Todo(String title){
        this.id = autoId.incrementAndGet();
        this.title = title;
        this.status = false;
    }
}
