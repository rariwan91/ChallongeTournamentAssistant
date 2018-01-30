package Repositories;

import CTAModels.ChallongeApiResponse;
import CTAModels.Tournaments.Tournament;

public class LoginRepository extends BaseRepository {
    public LoginRepository(String username, String apiKey) {
        super(username, apiKey);
    }

    public boolean testCredentials() {
        TournamentRepository tournamentRepository = new TournamentRepository(username, apiKey);
        ChallongeApiResponse<Tournament[]> response = tournamentRepository.index();
        return response.isValid();
    }
}
