/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oguzdanis.issuemanagement.repo;

import com.oguzdanis.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tatata
 */
public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
    
}
