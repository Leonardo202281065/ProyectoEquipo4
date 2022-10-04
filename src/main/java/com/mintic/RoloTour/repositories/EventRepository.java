package com.mintic.RoloTour.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mintic.RoloTour.models.EventModel;


@Repository
public interface EventRepository extends CrudRepository<EventModel, Long>{
    
}
