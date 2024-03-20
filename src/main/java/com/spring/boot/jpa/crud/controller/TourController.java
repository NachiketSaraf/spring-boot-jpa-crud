package com.spring.boot.jpa.crud.controller;

import com.spring.boot.jpa.crud.model.Tour;
import com.spring.boot.jpa.crud.service.TourService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tours")
@CrossOrigin
public class TourController {
    private final TourService tourService;
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }
    @GetMapping
    public List<Tour> getAllTours() {
        return tourService.getAllTours();
    }

    @GetMapping("/{id}")
    public Tour getTourById(@PathVariable Integer id) {
        return tourService.getTourById(id);
    }

    @PostMapping
    public List<Tour> createTour(@RequestBody List<Tour> tour) {
        return tourService.createTour(tour);
    }

    @PutMapping("/{id}")
    public Tour updateTour(@PathVariable Integer id, @RequestBody Tour tour) {
        return tourService.updateTour(id, tour);
    }

    @DeleteMapping("/{id}")
    public String deleteTour(@PathVariable Integer id) {
       return tourService.deleteTour(id);
    }

}
