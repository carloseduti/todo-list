package controller;

import lombok.AllArgsConstructor;
import model.Task;
import org.springframework.web.bind.annotation.*;
import service.TaskService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/todo")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/save")
    public Task createNewTodo(@RequestBody Task task) {
        return taskService.createNewTodo(task);
    }

}
