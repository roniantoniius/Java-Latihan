package roniantonius.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.repository.ProductRepository;


// @Scope
// @Lazy
@Component
public class ProductService {
    private String nama;
    // Dependency Injection (DI) melalui Anotasi Parameter
    @Getter
    private ProductRepository productRepository;

    // disini cara menerapkan Dependency Injection, yaitu dengna membuat objeknya sebagai constructor

    @Autowired // anotasi ini dipakai ketika membutuhkan lebih dari satu constructor, artinya Spring harus DI ini
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String nama){
        this.productRepository = productRepository;
        this.nama = nama;
    }

}
