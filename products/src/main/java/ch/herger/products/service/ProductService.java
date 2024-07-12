package ch.herger.products.service;

import ch.herger.products.repository.Product;
import ch.herger.products.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
  
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> findAll() {
    return this.productRepository.findAll();
  }

  public Optional<Product> findById(String id) {
    return this.productRepository.findById(id);
  }

  public List<Product> findByCategory(String category) {
    return this.productRepository.findByCategory(category);
  }

  public Product save(Product product) {
    return this.productRepository.save(product);
  }

  @PostConstruct
  public void init() {
    Product p = new Product();
    p.setCategory("Peripherals");
    p.setName("Mouse");
    p.setDescription("Best gaming mouse");
    p.setPrice(99.95d);

    save(p);
  }
}
