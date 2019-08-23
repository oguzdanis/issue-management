/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oguzdanis.issuemanagement.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import lombok.Data;//getter setter otomatik

/**
 *
 * @author tatata
 */
@Data
@MappedSuperclass//diger classlarda extend edilebilir hale gelir.
public class BaseEntity implements Serializable{
    
    private Date createdAt;
    
    private String createdBy;
    
    private Date updatedAt;
    
    private String updatedBy;
    
    private boolean status;
    
}
