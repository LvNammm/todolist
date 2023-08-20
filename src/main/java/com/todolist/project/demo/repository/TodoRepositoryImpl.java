package com.todolist.project.demo.repository;

import com.todolist.project.demo.database.TodoDB;
import com.todolist.project.demo.entities.Todo;

import java.util.List;

public class TodoRepositoryImpl implements TodoRepository{
    @Override
    public List<Todo> getAll() {
        return TodoDB.todoList;
    }
}
