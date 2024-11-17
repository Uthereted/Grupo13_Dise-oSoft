package com.strava.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import com.strava.dto.TrainingSessionDTO;

public class TrainingSession {
    private UUID id;
    private String title;
    private SportType sport;
    private Double distance;
    private LocalDate startDate;
    private LocalTime startTime;
    private Double duration;

    public TrainingSession(TrainingSessionDTO sessionDTO) {
        this.id = sessionDTO.getId();
        this.title = sessionDTO.getTitle();
        this.sport = sessionDTO.getSport();
        this.distance = sessionDTO.getDistance();
        this.startDate = sessionDTO.getStartDate();
        this.startTime = sessionDTO.getStartTime();
        this.duration = sessionDTO.getDuration();
    }

    // Getters y Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public SportType getSport() { return sport; }
    public void setSport(SportType sport) { this.sport = sport; }

    public Double getDistance() { return distance; }
    public void setDistance(Double distance) { this.distance = distance; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalTime getStartTime() { return startTime; }
    public void setStartTime(LocalTime startTime) { this.startTime = startTime; }

    public Double getDuration() { return duration; }
    public void setDuration(Double duration) { this.duration = duration; }
}
