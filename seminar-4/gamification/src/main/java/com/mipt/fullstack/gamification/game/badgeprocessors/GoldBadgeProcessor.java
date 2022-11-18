package com.mipt.fullstack.gamification.game.badgeprocessors;

import com.mipt.fullstack.gamification.challenge.ChallengeSolvedDTO;
import com.mipt.fullstack.gamification.game.domain.BadgeType;
import com.mipt.fullstack.gamification.game.domain.ScoreCard;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
class GoldBadgeProcessor implements BadgeProcessor {

    @Override
    public Optional<BadgeType> processForOptionalBadge(int currentScore,
                                                       List<ScoreCard> scoreCardList,
                                                       ChallengeSolvedDTO solved) {
        return currentScore > 400 ?
                Optional.of(BadgeType.GOLD) :
                Optional.empty();
    }

    @Override
    public BadgeType badgeType() {
        return BadgeType.GOLD;
    }
}
