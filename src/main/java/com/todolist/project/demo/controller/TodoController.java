package com.todolist.project.demo.controller;

import com.todolist.project.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("")
    public ResponseEntity<?> getListByStatus(@RequestParam Boolean status){
        return new ResponseEntity<>(todoService.getListByStatus(status), HttpStatus.OK);
    }
}
