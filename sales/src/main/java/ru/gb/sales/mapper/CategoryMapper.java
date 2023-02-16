package ru.gb.sales.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.gb.sales.model.Category;
import ru.gb.sales.model.dto.CategoryDTO;

@Component
public class CategoryMapper {

    public CategoryDTO mapperCategoryToCategoryDTO(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .status(category.getStatus())
                .build();
    }
}
