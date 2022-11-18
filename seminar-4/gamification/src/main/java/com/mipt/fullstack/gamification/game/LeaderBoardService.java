package com.mipt.fullstack.gamification.game;

import java.util.List;

import com.mipt.fullstack.gamification.game.domain.LeaderBoardRow;

public interface LeaderBoardService {

    /**
     * @return the current leader board ranked from high to low score
     */
    List<LeaderBoardRow> getCurrentLeaderBoard();
}
