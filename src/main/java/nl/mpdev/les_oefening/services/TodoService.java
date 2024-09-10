package nl.mpdev.les_oefening.services;

import nl.mpdev.les_oefening.models.Todo;
import nl.mpdev.les_oefening.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

  private final TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getAllTodo() {
    return todoRepository.findAll();
  }
}
