package com.omg.OMG.Controller;

import com.omg.OMG.Entity.Cart;
import com.omg.OMG.Entity.Product;
import com.omg.OMG.Repository.CartRepo;
import com.omg.OMG.Repository.ProductRepo;
import com.omg.OMG.Service.CartService;
import com.omg.OMG.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;


//@CrossOrigin("http://localhost:3000/product")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    ProductRepo productRepo;


    @GetMapping("/getAllproduct")
    public List<Product> getAllDetail() {
        List<Product> products = productService.getAllProduct();
        for (Product product : products) {
            byte[] imageBytes = product.getProdimg();
            if (imageBytes != null) {
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                product.setBase64Image(base64Image);
            }
        }
        return products;
    }
    @PostMapping("/addProduct")
    public Product CreateProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


    @DeleteMapping("/deleteProduct/{id}")
    public  String deleteProduct(@PathVariable String id) {
        // return UserService.deleteUser(id);
        productRepo.deleteById(id);
        return id + "Product Deleted!";
    }

}



//package com.Project.omg1.Controller;
//
//import com.Project.omg1.Model.product;
//import com.Project.omg1.Repository.ProductRepository;
//import com.Project.omg1.Service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Base64;
//import java.util.List;
//
//;

//@RestController
//@CrossOrigin
//@RequestMapping
//
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//    @Autowired
//    ProductRepo productRepo;
//
//    @GetMapping("/getAllproduct")
//    public List<Product> getAllDetail() {
//        List<Product> products = productService.getAllProduct();
//        for (Product product : products) {
//            byte[] imageBytes = product.getProd_img();
//            if (imageBytes != null) {
//                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
//                product.setBase64Image(base64Image);
//            } else {
//
//            }
//        }
//        return products;
//    }
//}