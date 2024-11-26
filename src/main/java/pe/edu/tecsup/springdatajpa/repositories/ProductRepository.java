package pe.edu.tecsup.springdatajpa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.tecsup.springdatajpa.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
//    void save(Product product) throws Exception;
//
//    List<Product> findAll() throws Exception;
//
    List<Product> findByName(String name) throws Exception;
//
//    Product findById(Long id) throws Exception;
//
//    void update(Long id, String productName) throws
//            Exception;
//
//    void deleteById(Long id) throws Exception;
}
