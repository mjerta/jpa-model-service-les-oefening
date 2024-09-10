package nl.mpdev.les_oefening.controllers;

import nl.mpdev.les_oefening.models.Todo;
import nl.mpdev.les_oefening.services.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodoController {

  private final TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping
  public ResponseEntity<List<Todo>> getAllTodo() {
    return ResponseEntity.ok().body(todoService.getAllTodo());
  }

}
