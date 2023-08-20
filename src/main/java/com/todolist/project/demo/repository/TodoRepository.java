package com.todolist.project.demo.repository;

import com.todolist.project.demo.entities.Todo;

import java.util.List;

public interface TodoRepository {
    List<Todo> getAll();
}
