package com.mipt.fullstack.gamification.game;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import com.mipt.fullstack.gamification.challenge.ChallengeSolvedDTO;

@RestController
@RequestMapping("/attempts")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class GameController {

    private final GameService gameService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    void postResult(@RequestBody ChallengeSolvedDTO dto) {
        gameService.newAttemptForUser(dto);
    }
}
