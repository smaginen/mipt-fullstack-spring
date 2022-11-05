package com.smagin.mipt.fullstack.sandwichgeneration.rest;

import com.smagin.mipt.fullstack.sandwichgeneration.model.Sandwich;
import com.smagin.mipt.fullstack.sandwichgeneration.service.SandwichGenerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SandwichGenerationController {
    private final SandwichGenerationService generationService;

    @GetMapping("/generate")
    public Sandwich generate() {
        return generationService.generate();
    }
}
