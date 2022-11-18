package com.mipt.fullstack.gamification.game;

import lombok.RequiredArgsConstructor;
import com.mipt.fullstack.gamification.game.domain.LeaderBoardRow;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class implements a REST API for the Gamification LeaderBoard service.
 */
@RestController
@RequestMapping("/leaders")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
class LeaderBoardController {

    private final LeaderBoardService leaderBoardService;

    @GetMapping
    public List<LeaderBoardRow> getLeaderBoard() {
        return leaderBoardService.getCurrentLeaderBoard();
    }
}
