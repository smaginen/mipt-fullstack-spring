package com.mipt.fullstack.gamification.game.badgeprocessors;

import com.mipt.fullstack.gamification.challenge.ChallengeSolvedEvent;
import com.mipt.fullstack.gamification.game.domain.BadgeType;
import com.mipt.fullstack.gamification.game.domain.ScoreCard;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
class SilverBadgeProcessor implements BadgeProcessor {

    @Override
    public Optional<BadgeType> processForOptionalBadge(int currentScore,
                                                       List<ScoreCard> scoreCardList,
                                                       ChallengeSolvedEvent solved) {
        return currentScore > 150 ?
                Optional.of(BadgeType.SILVER) :
                Optional.empty();
    }

    @Override
    public BadgeType badgeType() {
        return BadgeType.SILVER;
    }
}
