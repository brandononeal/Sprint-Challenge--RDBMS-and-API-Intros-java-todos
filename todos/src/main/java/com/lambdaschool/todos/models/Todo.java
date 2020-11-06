package com.lambdaschool.todos.models;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    private String description;
    private boolean completed;

    public Todo()
    {
    }

    public Todo(
        User user,
        String description,
        boolean completed)
    {
        this.user = user;
        this.description = description;
        this.completed = completed;
    }

    public long getTodoid()
    {
        return todoid;
    }

    public void setTodoid(long todoid)
    {
        this.todoid = todoid;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
