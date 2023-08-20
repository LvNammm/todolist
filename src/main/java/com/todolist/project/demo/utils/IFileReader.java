package com.todolist.project.demo.utils;

import com.todolist.project.demo.entities.Todo;

import java.util.List;

public interface IFileReader {
    List<Todo> readFile(String filePath);
}
