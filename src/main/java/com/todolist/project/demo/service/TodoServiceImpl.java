package com.todolist.project.demo.service;

import com.todolist.project.demo.entities.Todo;
import com.todolist.project.demo.repository.TodoRepository;
import com.todolist.project.demo.service.TodoService;

import java.util.List;

public class TodoServiceImpl implements TodoService {
    private TodoRepository todoRepository;
    @Override
    public List<Todo> getListByStatus(Boolean status) {
        return todoRepository.getAll().stream()
                .filter(todo -> todo.getStatus().equals(status)).toList();
    }
}
