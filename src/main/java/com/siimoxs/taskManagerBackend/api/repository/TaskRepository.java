package com.siimoxs.taskManagerBackend.api.repository;

import com.siimoxs.taskManagerBackend.api.model.Task;
import com.siimoxs.taskManagerBackend.api.model.TaskStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByStatus(TaskStatus status, Pageable pageable);

}

