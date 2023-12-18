package EmbeddedSystemsLab.Lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/todos")
public class TodoController {
    
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable String id) {
        return todoRepository.findById(id)
                .orElse(null);      // handle the case when Todo ist not 
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable String id, @RequestBody Todo updatedTodo) {
        return todoRepository.findById(id)
                .map(todo -> {
                    todo.setTitle(updatedTodo.getTitle());
                    todo.setDescription(updatedTodo.getDescription());
                    todo.setCompleted(updatedTodo.isCompleted());
                    return todoRepository.save(todo);
                })
                .orElse(null); // Handle the case when the Todo is not found
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id) {
        todoRepository.deleteById(id);
    }

}
