package Repositories;

class BaseRepository {
    final String BASE_URL = "https://api.challonge.com/v1/";
    String username;
    String apiKey;

    BaseRepository(String username, String apiKey) {
        this.username = username;
        this.apiKey = apiKey;
    }
}
