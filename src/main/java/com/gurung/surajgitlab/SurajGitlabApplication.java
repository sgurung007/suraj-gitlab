package com.gurung.surajgitlab;

import com.gurung.surajgitlab.entity.Hero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class SurajGitlabApplication implements CommandLineRunner {
	private final HeroService heroService;

	public SurajGitlabApplication(HeroService heroService) {
		this.heroService = heroService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SurajGitlabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Hero hero1 = new Hero();
		hero1.setName("superman");
		hero1.setPower("flying");

		Hero saveHero = heroService.saveHero(hero1);
		log.info("saved: {}",saveHero);
	}
}
