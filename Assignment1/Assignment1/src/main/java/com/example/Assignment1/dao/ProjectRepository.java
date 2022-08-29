package com.example.Assignment1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Assignment1.entity.ProjectDetails;


@Repository
public interface ProjectRepository extends JpaRepository<ProjectDetails, Integer> {

}
