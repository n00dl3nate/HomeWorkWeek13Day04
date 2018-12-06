package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    public List<Whisky> getAllWhiskysByYear(int year);

    public List<Whisky> getAllWhiskysByRegion(String region);

    public List<Whisky> getAllWhiskyByNameAndYear(int year ,String name);
}
