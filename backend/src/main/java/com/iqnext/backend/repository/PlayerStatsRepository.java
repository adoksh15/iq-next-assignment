package com.iqnext.backend.repository;

import com.iqnext.backend.model.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Integer> {

    // Used for dropdown (player names)
    List<PlayerStats> findDistinctByPlayerIsNotNull();

    // Used for search / comparison
    List<PlayerStats> findByPlayerContainingIgnoreCase(String player);
}
