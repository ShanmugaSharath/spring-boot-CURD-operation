package com.springcurdlast.lastproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcurdlast.lastproject.model.details;

@Repository
public interface repo extends JpaRepository<details,Integer>
 {

}
