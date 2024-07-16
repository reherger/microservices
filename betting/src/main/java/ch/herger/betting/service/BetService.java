package ch.herger.betting.service;

import ch.herger.betting.repository.BetRepository;
import org.springframework.stereotype.Service;

@Service
public class BetService {

  private final BetRepository betRepository;

  public BetService(BetRepository betRepository) {
    this.betRepository = betRepository;
  }
}
