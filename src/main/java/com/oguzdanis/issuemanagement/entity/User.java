/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oguzdanis.issuemanagement.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.NoArgsConstructor;

/**
 *
 * @author tatata
 */
@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    
    @Column(name = "uname",length = 100,unique = true)
    private String userName;
    
    @Column(name = "pwd")
    private String password;
    
    @Column(name = "name_surname",length = 200)
    private String nameSurname;
    
    @Column(name = "email",length = 100)
    private String email;
    
    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;
    
    
    
}
