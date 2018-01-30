package CTAModels;


import Constants.ResponseConstants;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

public class ChallongeApiResponse<T> {
    private T value;
    private int responseStatus;
    private String[] errors;

    public ChallongeApiResponse(HttpRequest request, Class responseClass) {
        try {
            HttpResponse<String> initialResponse = request.asString();
            responseStatus = initialResponse.getStatus();

            if (isValid()) {
                HttpResponse<T> finalResponse = request.asObject(responseClass);
                value = finalResponse.getBody();
            } else if (responseStatus == ResponseConstants.RESPONSE_VALIDATION_ERROR) {
                errors = new Gson().fromJson(initialResponse.getBody(), String[].class);
            }
        } catch (UnirestException e) {
            e.printStackTrace();
            // honestly we should never get here but I guess we'll handle that
            // when it comes time to handle that.
        }
    }

    public T value() {
        return value;
    }

    public boolean isValid() {
        return responseStatus == ResponseConstants.RESPONSE_GOOD;
    }

    public String[] errors() {
        return errors;
    }
}
