package com.gurung.surajgitlab.controller;

import com.gurung.surajgitlab.HeroService;
import com.gurung.surajgitlab.entity.Hero;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bir birs sgrg007@gmail.com
 * @project IntelliJ IDEA
 * @since 4/3/2022
 **/
@RestController
@RequestMapping("/hero")
public class HeroController {
    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping("/save-hero")
    public Hero saveHero(@RequestBody Hero hero) {
        return heroService.saveHero(hero);
    }

    @GetMapping("/get-all-hero")
    public List<Hero> getAllHero() {
        return heroService.getAllHero();
    }
}
