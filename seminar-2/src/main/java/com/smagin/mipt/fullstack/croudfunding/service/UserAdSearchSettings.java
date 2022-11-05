package com.smagin.mipt.fullstack.croudfunding.service;

import lombok.Data;

import java.time.LocalDate;
@Data
public class UserAdSearchSettings {
    private String tag;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer limitSum;

    public void getSettings(Long userId) {
    }
}
