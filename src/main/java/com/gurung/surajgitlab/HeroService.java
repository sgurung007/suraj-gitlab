package com.gurung.surajgitlab;

import com.gurung.surajgitlab.entity.Hero;
import com.gurung.surajgitlab.repository.HeroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bir birs sgrg007@gmail.com
 * @project IntelliJ IDEA
 * @since 4/3/2022
 **/
@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Hero saveHero(Hero hero){
        return heroRepository.save(hero);
    }

    public List<Hero> getAllHero(){
        return heroRepository.findAll();
    }
}
