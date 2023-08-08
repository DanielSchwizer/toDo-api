package com.emi.todoapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emi.todoapp.persistence.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
