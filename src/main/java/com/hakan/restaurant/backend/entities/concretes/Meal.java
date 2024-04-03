package com.hakan.restaurant.backend.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "meals")
@Entity
public class Meal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String mealName;
    private String category;


    @ManyToOne()
    @JoinColumn(name="meal_id")
    private Like like;

}
