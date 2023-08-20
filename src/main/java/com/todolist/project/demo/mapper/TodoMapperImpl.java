package com.todolist.project.demo.mapper;

import com.todolist.project.demo.dto.TodoDto;
import com.todolist.project.demo.entities.Todo;
import com.todolist.project.demo.mapper.TodoMapper;

public class TodoMapperImpl implements TodoMapper {

    @Override
    public TodoDto convertToDto(Todo todo) {
        TodoDto todoDto = new TodoDto();
        todoDto.setId(todo.getId());
        todoDto.setTitle(todo.getTitle());
        todoDto.setStatus(todo.getStatus());
        return todoDto;
    }

    @Override
    public Todo convertToEntity(TodoDto todoDto) {
        Todo todo = new Todo();
        todo.setId(todoDto.getId());
        todo.setTitle(todoDto.getTitle());
        todo.setStatus(todoDto.getStatus());
        return todo;
    }
}
