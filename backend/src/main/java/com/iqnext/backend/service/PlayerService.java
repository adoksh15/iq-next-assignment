package com.iqnext.backend.service;

import com.iqnext.backend.model.PlayerStats;
import com.iqnext.backend.repository.PlayerStatsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerStatsRepository playerStatsRepository;

    public PlayerService(PlayerStatsRepository playerStatsRepository) {
        this.playerStatsRepository = playerStatsRepository;
    }

    // 🔥 REAL DATA FROM DATABASE (no dummy)
    public List<PlayerStats> getAllPlayers() {
        return playerStatsRepository.findAll();
    }

    public PlayerStats getPlayerById(Integer id) {
        return playerStatsRepository.findById(id).orElse(null);
    }

    public List<PlayerStats> searchPlayers(String name) {
        return playerStatsRepository.findByPlayerContainingIgnoreCase(name);
    }
}
