package com.spring.boot.jpa.crud.service;

import com.spring.boot.jpa.crud.model.Tour;

import java.util.List;

public interface TourService {
    public List<Tour> getAllTours();
    public Tour getTourById(Integer id);
    public List<Tour> createTour(List<Tour> tour);
    public Tour updateTour(Integer id, Tour tour);
    public String deleteTour(Integer id);
}
