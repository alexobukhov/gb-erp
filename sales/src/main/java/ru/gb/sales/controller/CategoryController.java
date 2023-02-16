package ru.gb.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.sales.model.dto.CategoryDTO;
import ru.gb.sales.service.impl.SalesServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private SalesServiceImpl salesService;

    public String getCategories(Model model) {
        List<CategoryDTO> categoryDTOS = salesService.getCategories();
        model.addAttribute(categoryDTOS);
        return "category";
    }
}
