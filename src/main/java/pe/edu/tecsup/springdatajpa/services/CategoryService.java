package pe.edu.tecsup.springdatajpa.services;


import pe.edu.tecsup.springdatajpa.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories() throws Exception;
}
