package com.strava.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.strava.dto.UserDTO;

public class User {
    private UUID id;
    private String email;
    private String password;
    private String name;
    private LocalDate dateOfBirth;
    private Double weight; // Opcional
    private Double height; // Opcional
    private Integer maxHeartRate; // Opcional
    private Integer restingHeartRate; // Opcional
    private AuthProvider authProvider;

    private List<UUID> sessionIds = new ArrayList<>();
    private List<UUID> challengeIds = new ArrayList<>();

    public User(UserDTO userDTO) {
        this.id = userDTO.getId();
        this.email = userDTO.getEmail();
        this.password = userDTO.getPassword();
        this.name = userDTO.getName();
        this.dateOfBirth = userDTO.getDateOfBirth();
        this.weight = userDTO.getWeight();
        this.height = userDTO.getHeight();
        this.maxHeartRate = userDTO.getMaxHeartRate();
        this.restingHeartRate = userDTO.getRestingHeartRate();
        this.authProvider = userDTO.getAuthProvider();
    }

    // Getters y Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public Double getWeight() { return weight; }
    public void setWeight(Double weight) { this.weight = weight; }

    public Double getHeight() { return height; }
    public void setHeight(Double height) { this.height = height; }

    public Integer getMaxHeartRate() { return maxHeartRate; }
    public void setMaxHeartRate(Integer maxHeartRate) { this.maxHeartRate = maxHeartRate; }

    public Integer getRestingHeartRate() { return restingHeartRate; }
    public void setRestingHeartRate(Integer restingHeartRate) { this.restingHeartRate = restingHeartRate; }

    public AuthProvider getAuthProvider() { return authProvider; }
    public void setAuthProvider(AuthProvider authProvider) { this.authProvider = authProvider; }

    // Métodos para acceder y modificar sessionIds
    public List<UUID> getSessionIds() { return new ArrayList<>(sessionIds); }

    public void addSessionId(UUID sessionId) {
        if (sessionId != null && !sessionIds.contains(sessionId)) {
            sessionIds.add(sessionId);
        }
    }

    public void removeSessionId(UUID sessionId) { sessionIds.remove(sessionId); }

    // Métodos para acceder y modificar challengeIds
    public List<UUID> getChallengeIds() { return new ArrayList<>(challengeIds); }

    public void addChallengeId(UUID challengeId) {
        if (challengeId != null && !challengeIds.contains(challengeId)) {
            challengeIds.add(challengeId);
        }
    }

    public void removeChallengeId(UUID challengeId) { challengeIds.remove(challengeId); }
}

