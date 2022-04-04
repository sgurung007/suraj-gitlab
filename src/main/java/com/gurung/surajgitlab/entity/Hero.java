package com.gurung.surajgitlab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author bir birs sgrg007@gmail.com
 * @project IntelliJ IDEA
 * @since 4/3/2022
 **/
@Data
@NoArgsConstructor
@Entity
public class Hero {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;
    private String name;
    private String power;
}
