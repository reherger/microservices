package ch.herger.tournament.service;

import ch.herger.tournament.repository.TournamentRepository;
import org.springframework.stereotype.Service;

@Service
public class TournamentService {

  private final TournamentRepository tournamentRepository;

  public TournamentService(TournamentRepository tournamentRepository) {
    this.tournamentRepository = tournamentRepository;
  }
}
