package com.iqnext.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "player_playing_time")
public class PlayerPlayingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String player;
    private String position;
    private String team;
    private String age;

    @Column(name = "birth_year")
    private Integer birthYear;

    private Integer games;
    private Integer minutes;

    @Column(name = "minutes_per_game")
    private Integer minutesPerGame;

    @Column(name = "minutes_pct")
    private Double minutesPct;

    @Column(name = "minutes_90s")
    private Double minutes90s;

    @Column(name = "games_starts")
    private Integer gamesStarts;

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

    public Integer getBirthYear() { return birthYear; }
    public void setBirthYear(Integer birthYear) { this.birthYear = birthYear; }

    public Integer getGames() { return games; }
    public void setGames(Integer games) { this.games = games; }

    public Integer getMinutes() { return minutes; }
    public void setMinutes(Integer minutes) { this.minutes = minutes; }

    public Integer getMinutesPerGame() { return minutesPerGame; }
    public void setMinutesPerGame(Integer minutesPerGame) { this.minutesPerGame = minutesPerGame; }

    public Double getMinutesPct() { return minutesPct; }
    public void setMinutesPct(Double minutesPct) { this.minutesPct = minutesPct; }

    public Double getMinutes90s() { return minutes90s; }
    public void setMinutes90s(Double minutes90s) { this.minutes90s = minutes90s; }

    public Integer getGamesStarts() { return gamesStarts; }
    public void setGamesStarts(Integer gamesStarts) { this.gamesStarts = gamesStarts; }
}
