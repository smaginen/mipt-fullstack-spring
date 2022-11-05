package com.smagin.mipt.fullstack.sandwichgeneration.service;

import com.smagin.mipt.fullstack.sandwichgeneration.model.Sandwich;
import com.smagin.mipt.fullstack.sandwichgeneration.model.UserSandwichGenerationSettings;
import com.smagin.mipt.fullstack.sandwichgeneration.model.UserSandwichHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class SandwichGenerationService {
    private static List<String> breadKind = Arrays.asList("WHITE", "GRAY");
    private static List<String> vegetables = Arrays.asList("1", "2", "3");
    private static List<String> stuffing = Arrays.asList("1", "2", "3");

    private final UserSandwichHistoryService userSandwichHistoryService;

    public Sandwich generate() {
        int breadRand = new Random().nextInt(breadKind.size());
        int vegetablesRand = new Random().nextInt(vegetables.size());
        int stuffingRand = new Random().nextInt(stuffing.size());
        return new Sandwich(breadKind.get(breadRand),
                Collections.singletonList(vegetables.get(vegetablesRand)),
                Collections.singletonList(vegetables.get(stuffingRand)));
    }

    public Sandwich generate(UserSandwichGenerationSettings settings) {
        return null;
    }

    public Sandwich generateByHistory(UserSandwichGenerationSettings settings) {
        List<UserSandwichHistory> histories = userSandwichHistoryService.getHistories(settings.getUserId());
        return null;
    }


}
