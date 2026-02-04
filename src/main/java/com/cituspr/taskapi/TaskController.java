package com.cituspr.taskapi;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    public TaskController() {
        tasks.add(new Task(1, "Spring Boot Setup", true));
        tasks.add(new Task(2, "First REST Endpoint", false));
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        tasks.add(task);
        return task;
    }
}
