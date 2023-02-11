package ru.gb.sales.service.impl;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.sales.model.Category;
import ru.gb.sales.model.Status;
import ru.gb.sales.repository.CategoryRepository;
import ru.gb.sales.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category getCategory(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.saveAndFlush(category);
    }

    @Override
    @Transactional
    public Category changeCategoryStatus(Category category, Status status) {
        Category updateCategory = categoryRepository.findById(category.getId()).orElse(null);
        if (updateCategory == null) {
            return null;
        }
        updateCategory.setStatus(status);
        categoryRepository.saveAndFlush(updateCategory);
        return updateCategory;
    }
}
