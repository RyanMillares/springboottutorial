package com.avanade.internmanager.projects;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "project")
public class Project {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Setter
    private String projectName;

    @Getter
    @Setter
    private LocalDate startDate;

    @Getter
    @Setter
    private LocalDate endDate;

    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private Integer capacity;
    /*
    @Getter
    @Setter
    private Integer projectManagerId;  */

    @Getter 
    @Setter 
    @ManyToOne
    @JoinColumn(name = "project_manager_id")
    private ProjectManager projectManager;

    public Project() {
    }

    public Project(String projectName, LocalDate startDate, LocalDate endDate, String description, Integer capacity
          ) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.capacity = capacity;
        //this.projectManagerId = projectManagerId;
    }

    public Project(Integer id, String projectName, LocalDate startDate, LocalDate endDate, String description,
            Integer capacity) {
        this.id = id;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.capacity = capacity;
        //this.projectManagerId = projectManagerId;
    }
}
/*
 * id INT Primary
 */