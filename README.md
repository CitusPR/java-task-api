# Java Task REST API

A simple REST API built with **Java 17** and **Spring Boot**.

## Features
- ✅ GET `/tasks` returns a JSON list of tasks
- ✅ POST `/tasks` adds a new task (JSON body)

## Endpoints

### GET /tasks
Returns all tasks.

Example response:
```json
[
  { "id": 1, "title": "Spring Boot Setup", "done": true },
  { "id": 2, "title": "First REST Endpoint", "done": false }
]
