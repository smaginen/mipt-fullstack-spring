package com.smagin.mipt.fullstack.croudfunding.service;

import com.smagin.mipt.fullstack.croudfunding.model.Advertisement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final AdvertisementService advertisementService;

    public List<Advertisement> getRelevantAdvertisements(UserAdSearchSettings searchSettings){
        return advertisementService.getAdvertisements(searchSettings);
    }
}
