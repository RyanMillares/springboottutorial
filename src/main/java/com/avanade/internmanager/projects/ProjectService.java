package com.avanade.internmanager.projects;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private ProjectRepository repository;
    public ProjectService(ProjectRepository projectRepository) {
        this.repository = projectRepository;
    }

    public List<Project> GetAllProjects() {
        /*
        List<Project> projects = List.of(
                new Project("project_1", LocalDate.parse("2023-02-27"), LocalDate.parse("2024-04-28"),
                        "project1 description", 15, null),
                new Project("project_2", LocalDate.parse("2023-02-27"), LocalDate.parse("2024-04-28"),
                        "project 2 description", 8, null),
                new Project("project_3", LocalDate.parse("2023-02-27"), LocalDate.parse("2024-04-28"),
                        "project 3 description", 12, null));
 */
        List<Project> projects = repository.findAll();
        return projects;
    }
}
