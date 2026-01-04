package dev.java10xphilipe_borges.Fridge.repository;

import dev.java10xphilipe_borges.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
