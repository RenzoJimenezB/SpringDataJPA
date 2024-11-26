package pe.edu.tecsup.springdatajpa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.tecsup.springdatajpa.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
