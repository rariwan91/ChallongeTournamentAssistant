package Repositories;

import CTAModels.Tournaments.Tournament;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class TournamentRepository extends BaseRepository {
    private final String BASE_URL = super.BASE_URL + "tournaments";

    public TournamentRepository(String username, String apiKey) {
        super(username, apiKey);
    }

    public Tournament[] index() {
        try {
            HttpResponse<Tournament[]> response = Unirest.get(BASE_URL + ".json").basicAuth(username, apiKey)
                    .asObject(Tournament[].class);
            return response.getBody();
        } catch (UnirestException e) {
            return new Tournament[0];
        }
    }

    public Tournament show(String tournamentName) {
        try {
            HttpResponse<Tournament> response = Unirest.get(BASE_URL + "/" + tournamentName + ".json").basicAuth(username, apiKey)
                    .asObject(Tournament.class);
            return response.getBody();
        } catch (UnirestException e) {
            return null;
        }
    }

    // No UI currently hooked up to look up a tournament by its id number
    // so I'm leaving it commented out for now.
//    public Tournament show(int tournamentId) {
//        try {
//            HttpResponse<Tournament> response = Unirest.get(BASE_URL + "/" + tournamentId + ".json").basicAuth(username, apiKey)
//                    .asObject(Tournament.class);
//            Tournament result = response.getBody();
//            return result;
//        } catch (UnirestException e) {
//            return null;
//        }
//    }
}
