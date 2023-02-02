package ru.gb.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.sales.model.Category;
import ru.gb.sales.model.Product;
import ru.gb.sales.model.Status;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public Product findByNameContaining(String searchString);

    public List<Product> findByCategory(Category category);

    public List<Product> findByStatus(Status status);
}
