package com.bktsh.practice.service;

import com.bktsh.practice.mapper.TodoMapper;
import com.bktsh.practice.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 2017-Feb-16
 */
@Service
@Transactional
public class TodoService {

    @Autowired
    private TodoMapper todoMapper;

    public Todo getTodoById(int todoId) {
        return this.todoMapper.getTodoById(todoId);
    }
    public List<Todo> getAll() {
        return this.todoMapper.getAll();
    }
}
