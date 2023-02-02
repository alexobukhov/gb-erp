package ru.gb.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.sales.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    public Category findByNameContaining(String searchString);
}
