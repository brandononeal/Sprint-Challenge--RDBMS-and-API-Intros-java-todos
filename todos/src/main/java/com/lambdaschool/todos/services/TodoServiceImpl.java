package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosService")
public class TodoServiceImpl implements TodoService
{
    @Autowired
    private TodoRepository todorepos;

    @Override
    public Todo save(Todo todo)
    {
       Todo newTodo = new Todo();

       newTodo.setUser(todo.getUser());
       newTodo.setDescription(todo.getDescription());
       newTodo.setCompleted(false);

       return todorepos.save(newTodo);
    }

    @Override
    public void markComplete(long todoid)
    {
    }
}
