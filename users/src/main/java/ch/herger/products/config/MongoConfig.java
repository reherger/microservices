package ch.herger.products.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "ch.herger.products.repository")
@Configuration
public class MongoConfig  {

  // see application properties
}
