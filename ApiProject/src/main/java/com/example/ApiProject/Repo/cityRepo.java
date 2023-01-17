package com.example.ApiProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.ApiProject.entity.City;

@RepositoryRestResource(collectionResourceRel="cities")
public interface cityRepo  extends JpaRepository<City,Integer>{

} 