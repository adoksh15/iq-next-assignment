package com.iqnext.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "player_stats")
public class PlayerStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String player;
    private String position;
    private String team;
    private String age;
    private String club;

    @Column(name = "birth_year")
    private Integer birthYear;

    private Integer games;

    @Column(name = "games_starts")
    private Integer gamesStarts;

    private Integer minutes;

    @Column(name = "minutes_90s")
    private Double minutes90s;

    private Integer goals;
    private Integer assists;

    // --- Getters & Setters ---

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getClub() { return club; }
    public void setClub(String club) { this.club = club; }

    public Integer getBirthYear() { return birthYear; }
    public void setBirthYear(Integer birthYear) { this.birthYear = birthYear; }

    public Integer getGames() { return games; }
    public void setGames(Integer games) { this.games = games; }

    public Integer getGamesStarts() { return gamesStarts; }
    public void setGamesStarts(Integer gamesStarts) { this.gamesStarts = gamesStarts; }

    public Integer getMinutes() { return minutes; }
    public void setMinutes(Integer minutes) { this.minutes = minutes; }

    public Double getMinutes90s() { return minutes90s; }
    public void setMinutes90s(Double minutes90s) { this.minutes90s = minutes90s; }

    public Integer getGoals() { return goals; }
    public void setGoals(Integer goals) { this.goals = goals; }

    public Integer getAssists() { return assists; }
    public void setAssists(Integer assists) { this.assists = assists; }
}
