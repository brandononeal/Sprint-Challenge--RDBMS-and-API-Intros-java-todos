package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todosService")
public class TodoServiceImpl implements TodoService
{
    @Autowired
    TodoRepository todoRepository;

    @Override
    public void markComplete(long todoid)
    {
        Todo todo = todoRepository.findById(todoid)
            .orElseThrow(() -> new EntityNotFoundException("Todo id " + todoid + " not found!"));
        todo.isCompleted();
    }
}
