package com.mintic.RoloTour.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.RoloTour.models.EventModel;
import com.mintic.RoloTour.services.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping()
    public ArrayList<EventModel> getEvent() {
        return eventService.getEvent();
    }

    /**
     * @param event
     * @return
     */
    @PostMapping()
    public EventModel saveEvent(@RequestBody EventModel event){
        return this.eventService.saveEvent(event);
    }
}
