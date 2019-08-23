/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oguzdanis.issuemanagement.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;//getter setter otomatik

/**
 *
 * @author tatata
 */
@Data
@MappedSuperclass//diger classlarda extend edilebilir hale gelir.
public class BaseEntity implements Serializable{
    
    @Column(name ="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    @Column(name = "created_by",length = 100)
    private String createdBy;
    
    @Column(name="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    
    @Column(name="updated_by",length = 100)
    private String updatedBy;
    
    @Column(name="status")
    private boolean status;
    
}
