package RESTCommunicator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class RESTCommunicator {
    public static String send(String requestUrl, String method, String payload, int timeout) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(timeout);

            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod(method.toUpperCase());
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            if(!payload.isEmpty()) {
                writer.write(payload);
            }
            writer.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer jsonString = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                jsonString.append(line);
            }
            br.close();
            connection.disconnect();

            return jsonString.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String post(String url, String payload, int timeout, String apiKey) {
        return send("https://"+url+"?api_key="+apiKey, "POST", payload, timeout);
    }

    public static String get(String url, String payload, int timeout, String apiKey) {
       return send("https://"+url+"?api_key="+apiKey, "GET", payload, timeout);
    }

    public static String put(String url, String payload, int timeout, String apiKey) {
        return send("https://"+url+"?api_key="+apiKey, "PUT", payload, timeout);
    }

    public static String delete(String url, int timeout, String apiKey) {
        return send("https://"+url+"?api_key="+apiKey, "DELETE", "{}", timeout);
    }
}
