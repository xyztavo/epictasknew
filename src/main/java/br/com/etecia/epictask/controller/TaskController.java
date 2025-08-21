package br.com.etecia.epictask.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.etecia.epictask.model.Task;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping
    public String listTasks() {
        var tasks = List.of(new Task(1L, "Criar banco de dados", "Criar banco de dados mysql", 50, 0);, task2, task);

        return "tasks";
    }

}
