package com.mipt.fullstack.gamification.game;

import java.util.List;

import lombok.Value;
import com.mipt.fullstack.gamification.challenge.ChallengeSolvedDTO;
import com.mipt.fullstack.gamification.game.domain.BadgeType;

/**
 * This service includes the main logic for gamifying the system.
 */
public interface GameService {

    /**
     * Process a new attempt from a given user.
     *
     * @param challenge the challenge data with user details, factors, etc.
     * @return a {@link GameResult} object containing the new score and badge cards obtained
     */
    GameResult newAttemptForUser(ChallengeSolvedDTO challenge);

    @Value
    class GameResult {
        int score;
        List<BadgeType> badges;
    }
}
