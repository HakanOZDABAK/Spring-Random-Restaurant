package com.hakan.restaurant.backend.dataAccess.abstracts;

import com.hakan.restaurant.backend.entities.concretes.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MealRepository extends JpaRepository<Meal,Integer> {

    @Query("")
    
}
