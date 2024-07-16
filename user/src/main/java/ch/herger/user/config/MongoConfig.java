package ch.herger.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "ch.herger.user.repository")
@Configuration
public class MongoConfig  {

  // see application properties
}
