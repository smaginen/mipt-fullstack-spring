package com.smagin.mipt.fullstack.croudfunding.service;

import com.smagin.mipt.fullstack.croudfunding.model.Advertisement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdvertisementService {
    private static List<Advertisement> advertisementStorage = new ArrayList<>();
    private final UserAdSearchSettingsService userAdSearchSettingsService;
    public void addAdvertisement(Long userId, Integer countMoney, String goal, String description) {
        advertisementStorage.add(new Advertisement(userId, countMoney, goal, description));
    }
    public List<Advertisement> getAdvertisements(Long userId) {
        UserAdSearchSettings settings = userAdSearchSettingsService.getSettings(userId);
        return getAdvertisements(settings);
    }
    public List<Advertisement> getAdvertisements(UserAdSearchSettings userAdSearchSettings) {
        return advertisementStorage.stream()
                .filter(ad -> ad.getCountMoney() <= userAdSearchSettings.getLimitSum())
                .collect(Collectors.toList());
    }
}
