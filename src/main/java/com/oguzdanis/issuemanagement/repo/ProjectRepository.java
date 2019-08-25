/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oguzdanis.issuemanagement.repo;

import com.oguzdanis.issuemanagement.entity.Project;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tatata
 */

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
    List<Project> getAllByProjectProjectCode(String projectCode);
    
    List<Project> getAllByProjectCodeAndNotNull(String projectCode);
    
    List<Project> getAllByProjectCodeAndProjectName(String projectCode,String projectName);
    
    
    
    
}
