package com.springcurdlast.lastproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class details {
 
    @Id
    private int rno;
    @Column
    private String name;
    private String technology;
    
}
