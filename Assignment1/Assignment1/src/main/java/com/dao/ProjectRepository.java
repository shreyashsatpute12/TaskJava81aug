package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ProjectDetails;





@Repository
public interface ProjectRepository extends JpaRepository<ProjectDetails, Integer> {

}
