package ru.gb.sales.service;

import ru.gb.sales.model.Category;
import ru.gb.sales.model.Status;

import java.util.List;

public interface CategoryService {

    Category getCategory(long id);

    List<Category> getCategories();

    void addCategory(Category category);

    Category changeCategoryStatus(Category category, Status status);
}
