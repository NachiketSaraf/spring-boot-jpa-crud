package com.spring.boot.jpa.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "tours", schema = "postgres")
@NoArgsConstructor
@AllArgsConstructor
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "max_group_size")
    private Integer maxGroupSize;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "price")
    private Double price;

    @Column(name = "summary")
    private String summary;

    @Column(name = "image")
    private String image;

    @Column(name = "secret_tour")
    private Boolean secretTour;

    @Column(name = "start_date")
    private Date startDates;

    @Column(name = "duration_weeks")
    private Integer durationWeeks;
}

