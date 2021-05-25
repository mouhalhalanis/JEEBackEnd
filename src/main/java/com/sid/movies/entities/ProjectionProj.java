package com.sid.movies.entities;
import java.util.Collection;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;
@Projection(name="p1",types= {com.sid.movies.entities.Projection.class})

public interface ProjectionProj {
public Long getId();
public double getPrix();
public Date getDateProjection();
public Salle getSalle();
public Film getFilm();
public Seance getSeance();
public Collection<Ticket> getTickets();
}
