package com.lambdaschool.todos.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosService")
public class TodoServiceImpl implements TodoService
{
    @Override
    public void markComplete(long todoid)
    {
    }
}
