package com.mintic.RoloTour.services;

import java.util.ArrayList;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.RoloTour.models.EventModel;
import com.mintic.RoloTour.repositories.EventRepository;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public ArrayList<EventModel> getEvent() {
        return (ArrayList<EventModel>)eventRepository.findAll();
    }


    public EventModel saveEvent(EventModel event) {
        return eventRepository.save(event);
    }
}
