package ch.herger.products.service;

import ch.herger.products.repository.User;
import ch.herger.products.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  
  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository productRepository) {
    this.userRepository = productRepository;
  }

  public List<User> findAll() {
    return this.userRepository.findAll();
  }

  public Optional<User> findById(String id) {
    return this.userRepository.findById(id);
  }

  public User save(User product) {
    return this.userRepository.save(product);
  }

  @PostConstruct
  public void init() {
    User u = new User();
    u.setName("Mouse");

    save(u);
  }
}
