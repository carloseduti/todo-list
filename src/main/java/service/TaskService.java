package service;

import lombok.AllArgsConstructor;
import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TaskRepository;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createNewTodo(Task task){
        return taskRepository.save(task);
    }
}
