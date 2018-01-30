package Repositories;

import CTAModels.ChallongeApiResponse;
import CTAModels.Tournaments.Tournament;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.HttpRequest;

public class TournamentRepository extends BaseRepository {
    private final String BASE_URL = super.BASE_URL + "tournaments";

    public TournamentRepository(String username, String apiKey) {
        super(username, apiKey);
    }

    public ChallongeApiResponse<Tournament[]> index() {
        // if responseStatus is GOOD then we can return the Tournament[]
        // else we need to somehow return the error message

        HttpRequest request = Unirest.get(BASE_URL + ".json")
                .basicAuth(username, apiKey);

        return new ChallongeApiResponse<>(request, Tournament[].class);
    }

    public ChallongeApiResponse<Tournament> show(String tournamentName) {
        HttpRequest request = Unirest.get(BASE_URL + "/" + tournamentName + ".json")
                .basicAuth(username, apiKey);
        return new ChallongeApiResponse<>(request, Tournament.class);
    }
}
