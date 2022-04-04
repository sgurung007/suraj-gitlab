package com.gurung.surajgitlab.repository;

import com.gurung.surajgitlab.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author bir birs sgrg007@gmail.com
 * @project IntelliJ IDEA
 * @since 4/3/2022
 **/
@Repository
public interface HeroRepository extends JpaRepository<Hero, UUID> {
}
