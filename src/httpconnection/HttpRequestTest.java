package httpconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class HttpRequestTest {
    public static void main(String[] args) {
        String urlAddress = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"Java\"";
        HttpURLConnection connection = null;

        URL url = null;
        InputStreamReader isR = null;
        BufferedReader bfR = null;
        URLEncoder urlEncoder = null;
        try {
            url = new URL(urlAddress);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(200);
            connection.setReadTimeout(200);
            connection.connect();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                isR = new InputStreamReader(connection.getInputStream());
                bfR = new BufferedReader(isR);
                String line;
                while ((line = bfR.readLine()) != null) {
//                    line = URLEncoder.encode(line, StandardCharsets.UTF_8);

                    System.out.println(line);
                }
            } else {
                System.out.printf("Fail %s", connection.getResponseCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bfR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
