package com.spring.boot.jpa.crud.reposetory;

import com.spring.boot.jpa.crud.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour,Integer> {
}
