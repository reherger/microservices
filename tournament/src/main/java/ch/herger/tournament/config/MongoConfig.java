package ch.herger.tournament.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "ch.herger.tournament.repository")
@Configuration
public class MongoConfig  {

  // see application properties
}
