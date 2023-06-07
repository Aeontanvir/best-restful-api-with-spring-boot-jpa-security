package com.aeontanvir.projectcosting.services.impl;

import com.aeontanvir.projectcosting.domains.Project;
import com.aeontanvir.projectcosting.repositories.ProjectRepository;
import com.aeontanvir.projectcosting.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    @Override
    public List<Project> getAll() {
        return projectRepository.findAll();
    }
}
