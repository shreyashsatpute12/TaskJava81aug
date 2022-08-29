package com.serviceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Exception.ProjDetailsNotFound;
import com.dao.ProjectRepository;
import com.dto.ProjectDTO;
import com.entity.ProjectDetails;
import com.services.ProjectService;

public class ProjectServiceImpl implements ProjectService {

	
	@Autowired 
	private ProjectRepository projectRepo;
	
	
	@Transactional
	
	
	
	@Override
	public void addProjectDetails(ProjectDTO project) {
		
		ProjectDetails projectDetails=new ProjectDetails();
		projectDetails.setBudget(project.getBudget());
		projectDetails.setDuration(project.getDuration());
		projectDetails.setEndDate(project.getEndDate());
		projectDetails.setManagerName(project.getManagerName());
		projectDetails.setTeamSize(project.getTeamSize());
		projectDetails.setTitle(project.getTitle());
		
		projectRepo.save(projectDetails);
		
	}
	@Transactional
	@Override
	public void updatePorjectDetails(int ProjectId)throws  ProjDetailsNotFound {
		
		
		Optional<ProjectDetails> optional=projectRepo.findById(ProjectId);
		ProjectDetails projectDetails=optional.orElseThrow(()->new ProjDetailsNotFound("Project Details not found"));
		projectDetails.setTitle("DetailsUpdated");
		
		projectRepo.save(projectDetails);
	}
	@Transactional
	@Override
	public void deleteProjectDetails(int ProjectId)throws  ProjDetailsNotFound {
		Optional<ProjectDetails> project = projectRepo.findById(ProjectId);
		project.orElseThrow(() -> new ProjDetailsNotFound("Project not found.Hence cannot be deleted"));
		projectRepo.deleteById(ProjectId);
		
	}
	@Transactional
	@Override
	public List<ProjectDTO> allProjectDetails()throws  ProjDetailsNotFound {
		Iterable <ProjectDetails>projectDetails=projectRepo.findAll();
		List<ProjectDTO>listProjDTO=new ArrayList<>();
		projectDetails.forEach(project->{
			ProjectDTO projectDTO=new ProjectDTO();
			projectDTO.setBudget(project.getBudget());
			projectDTO.setDuration(project.getDuration());
			projectDTO.setEndDate(project.getEndDate());
			projectDTO.setManagerName(project.getManagerName());
			projectDTO.setProjectId(project.getProjectId());
			projectDTO.setTeamSize(project.getTeamSize());
			projectDTO.setTitle(project.getTitle());
			
			
			listProjDTO.add(projectDTO);
		});
		if (listProjDTO.isEmpty())
			throw new ProjDetailsNotFound("No Project Details found");
		return listProjDTO;
	}

	
	
	
	
}
