package com.cituspr.taskapi;

public class Task {
    public long id;
    public String title;
    public boolean done;

    public Task(long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }
}
