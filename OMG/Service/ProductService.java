package com.omg.OMG.Service;

import com.omg.OMG.Entity.Cart;
import com.omg.OMG.Entity.Product;
import com.omg.OMG.Repository.CartRepo;
import com.omg.OMG.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


        @Autowired
        private ProductRepo productRepo;

        public Product createProduct(Product product) {
            return productRepo.save(product);
        }

        public List<Product> getAllProduct() {
            return productRepo.findAll();
        }

        public Product insertProduct(Product product) {
            return productRepo.save(product);
        }

    }


