package CTAModels;

public class UserModel {
    private String apiKey;
    private String username;

    public void setApiKey(String key){
        this.apiKey = key;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getApiKey(){
        return this.apiKey;
    }

    public String getUsername(){
        return this.username;
    }
}
