package com.desuperior.dscommerce.repositories;

import com.desuperior.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {


}
