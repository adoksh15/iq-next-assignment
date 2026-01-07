package com.iqnext.backend.repository;

import com.iqnext.backend.model.PlayerPlayingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerPlayingTimeRepository
        extends JpaRepository<PlayerPlayingTime, Integer> {
}
