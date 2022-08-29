package com.services;

import java.util.List;

import com.Exception.ProjDetailsNotFound;
import com.dto.ProjectDTO;

public interface ProjectService {

	
	public void addProjectDetails(ProjectDTO project) ;
	public void updatePorjectDetails (int ProjectId)throws  ProjDetailsNotFound;
	public void deleteProjectDetails(int ProjectId)throws  ProjDetailsNotFound;
	public List<ProjectDTO> allProjectDetails()throws  ProjDetailsNotFound;
	
	
	
	
}
