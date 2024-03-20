package com.spring.boot.jpa.crud.service;

import com.spring.boot.jpa.crud.model.Tour;
import com.spring.boot.jpa.crud.reposetory.TourRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    private final TourRepository tourRepository;

    public TourServiceImpl(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @Override
    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }

    @Override
    public Tour getTourById(Integer id) {
        return tourRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tour> createTour(List<Tour> tour) {
        return tourRepository.saveAll(tour);
    }

    @Override
    public Tour updateTour(Integer id, Tour tour) {
        if (!tourRepository.existsById(id)) {
            return null;
        }
        tour.setId(id);
        return tourRepository.save(tour);
    }

    @Override
    public String deleteTour(Integer id) {
        tourRepository.deleteById(id);
        return "Tour delete with id: " + id;
    }
}
