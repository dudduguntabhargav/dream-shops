package com.ecommerce.dreamshops.service.category;

import com.ecommerce.dreamshops.model.Category;
import java.util.*;
public interface ICategoryService {
    Category getCategoryByID(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategory(Long id);

}
