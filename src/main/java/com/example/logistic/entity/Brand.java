package com.example.logistic.entity;

import com.example.logistic.util.EntityIdResolver;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        scope = Brand.class,
        resolver = EntityIdResolver.class,
        property = "id"
)
public class Brand implements ComboListItem{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String name;
}
