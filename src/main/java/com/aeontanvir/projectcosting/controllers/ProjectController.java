package com.aeontanvir.projectcosting.controllers;


import com.aeontanvir.projectcosting.domains.Project;
import com.aeontanvir.projectcosting.dtos.ProjectDto;
import com.aeontanvir.projectcosting.helpers.ModelMapperHelper;
import com.aeontanvir.projectcosting.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;
    private final ModelMapperHelper modelMapperHelper;

    @GetMapping
    public List<ProjectDto> getAll() {
        List<Project> projects = projectService.getAll();
        return projects.stream()
                .map(project-> (ProjectDto) modelMapperHelper.convertToDto(project, ProjectDto.class))
                .collect(Collectors.toList());
    }

}
