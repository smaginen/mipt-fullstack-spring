package com.smagin.mipt.fullstack.croudfunding.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Advertisement {
    private Long userId;
    private Integer countMoney;
    private String goal;
    private String description;
}
