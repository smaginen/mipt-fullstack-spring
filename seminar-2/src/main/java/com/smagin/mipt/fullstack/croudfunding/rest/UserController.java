package com.smagin.mipt.fullstack.croudfunding.rest;

import com.smagin.mipt.fullstack.croudfunding.model.Advertisement;
import com.smagin.mipt.fullstack.croudfunding.service.AdvertisementService;
import com.smagin.mipt.fullstack.croudfunding.service.UserAdSearchSettings;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final AdvertisementService advertisementService;

    @GetMapping("/{id}/relevent-ads")
    public List<Advertisement> advertisementList(@PathVariable("id") Long userId){

        return advertisementService.getAdvertisements(userId);
    }
}
