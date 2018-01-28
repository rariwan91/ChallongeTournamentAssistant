package Initialization;

import com.google.gson.Gson;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;

public class Startup {
    public static void initialize() {
        /*
          This allows us to use Unirest automatically with the gson
          serializer / deserializer throughout the rest of the app.
         */
        Unirest.setObjectMapper(new ObjectMapper() {
            public <T> T readValue(String value, Class<T> valueType) {
                return new Gson().fromJson(value, valueType);
            }

            public String writeValue(Object value) {
                return new Gson().toJson(value);
            }
        });
    }
}
