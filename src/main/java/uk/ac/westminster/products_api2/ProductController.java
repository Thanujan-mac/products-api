package uk.ac.westminster.products_api2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{
    // 1. Map POST requests to the "/products" URL
    @PostMapping("/products")
    // 2. @RequestBody tells Spring: "Take the incoming JSON and convert it into a Product object"
    public String createProduct(@RequestBody Product newProduct){

        // 3. You can now use the Java object normally
        System.out.println("Saving product to database: " + newProduct.getName());

        return "Successfully created product: " + newProduct.getName() +
                " for $" + newProduct.getPrice();
    }
}
