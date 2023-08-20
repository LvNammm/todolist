package com.todolist.project.demo.service;

import com.todolist.project.demo.entities.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    List<Todo> getListByStatus(Boolean status);
}
