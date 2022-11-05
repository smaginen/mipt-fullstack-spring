package com.smagin.mipt.fullstack.croudfunding.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final AdvertisementService advertisementService;

    public void createAdvertisement(Long userId, Integer countMoney, String goal, String description){
        advertisementService.addAdvertisement(userId, countMoney, goal, description);
    }
}
