package pe.edu.tecsup.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.tecsup.springdatajpa.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(String name) throws Exception;
}
