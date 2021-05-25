package com.sid.movies.entities;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ville {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private double longtitude,latitude,altitude;
@OneToMany(mappedBy="ville")
@JsonProperty(access=Access.WRITE_ONLY)
private Collection<Cinema> cinemas;
}
