package edu.gus.todolist.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "tb_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable = false)
    private String description = "task";
    @Column(nullable = false)
    private Boolean completed = false;

    @PrePersist
    public void prePersist() {
        if (description == null) description = "task";
        if (completed == null) completed = false;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
