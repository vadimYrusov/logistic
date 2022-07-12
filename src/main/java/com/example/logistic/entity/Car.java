package com.example.logistic.entity;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car implements ComboListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    private Model model;
}
