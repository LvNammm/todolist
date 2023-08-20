package com.todolist.project.demo.mapper;

import com.todolist.project.demo.dto.TodoDto;
import com.todolist.project.demo.entities.Todo;

public interface TodoMapper {
    TodoDto convertToDto(Todo todo);
    Todo convertToEntity(TodoDto todoDto);
}
