package com.sid.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.movies.entities.Place;
@CrossOrigin("*")
@RepositoryRestResource
public interface PlaceRepository extends
JpaRepository<Place,Long> {
}
