package com.Naveen.FullStack.springbootecommerce1.Dao;

import com.Naveen.FullStack.springbootecommerce1.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository  extends JpaRepository<Product,Long> {
}
