package com.smagin.mipt.fullstack.sandwichgeneration.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
@Data
public class Sandwich {
    private final String breadKind;
    private final List<String> vegetables;
    private final List<String> stuffing;
}
