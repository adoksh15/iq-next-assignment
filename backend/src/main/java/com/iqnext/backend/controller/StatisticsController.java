package com.iqnext.backend.controller;

import com.iqnext.backend.model.PlayerStats;
import com.iqnext.backend.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/statistics")
@CrossOrigin(origins = "http://localhost:5173")
public class StatisticsController {

    private final PlayerService playerService;

    public StatisticsController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // ✅ Get ALL players (real DB data)
    @GetMapping("/players")
    public List<PlayerStats> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    // ✅ Get player by ID
    @GetMapping("/player/{id}")
    public PlayerStats getPlayerById(@PathVariable Integer id) {
        return playerService.getPlayerById(id);
    }

    // ✅ Search players by name (dropdown / search)
    @GetMapping("/search")
    public List<PlayerStats> searchPlayers(@RequestParam String name) {
        return playerService.searchPlayers(name);
    }
}
