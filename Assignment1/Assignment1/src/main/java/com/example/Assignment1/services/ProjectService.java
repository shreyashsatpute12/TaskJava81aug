package com.example.Assignment1.services;

import java.util.List;

import com.example.Assignment1.Exception.ProjDetailsNotFound;
import com.example.Assignment1.dto.ProjectDTO;

public interface ProjectService {

	
	public void addProjectDetails(ProjectDTO project) ;
	public void updatePorjectDetails (int ProjectId)throws  ProjDetailsNotFound;
	public void deleteProjectDetails(int ProjectId)throws  ProjDetailsNotFound;
	public List<ProjectDTO> allProjectDetails()throws  ProjDetailsNotFound;
	
	
	
	
}
