package ch.herger.betting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BetRepository extends MongoRepository<Bet, String> {

}
