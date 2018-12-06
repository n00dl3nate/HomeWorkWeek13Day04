package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/year/{year}")
    public List<Whisky> allWhiskeybyYear(@PathVariable int year){
        return whiskyRepository.getAllWhiskysByYear(year);
    }

    @GetMapping(value = "/region/{region}")
    public List<Whisky> allWhiskiesByRegion(@PathVariable String region){
        return whiskyRepository.getAllWhiskysByRegion(region);
    }

    @GetMapping(value = "/name/{name}/{year}")
    public List<Whisky> allWhiskeyByNameAndYear(@PathVariable String name,@PathVariable int year){
        return whiskyRepository.getAllWhiskyByNameAndYear(year,name);
    }

}


