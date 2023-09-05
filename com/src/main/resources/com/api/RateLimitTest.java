package com.api;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RateLimitTest {

public static void main(String[] args) {
String apiUrl = "http://localhost:5000/upload"; // Replace with your API endpoint URL

try {
for (int i = 0; i < 10; i++) {
    HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
    connection.setRequestMethod("POST");
     connection.setDoOutput(true);

// Send the request
  int responseCode = connection.getResponseCode();
  String responseMessage = connection.getResponseMessage();

  System.out.println("Response Code: " + responseCode);
  System.out.println("Response Message: " + responseMessage);

// Close the connection
  connection.disconnect();

// Sleep for a second to simulate rate limiting
  Thread.sleep(1000);
    }
   } 
    catch (IOException | InterruptedException e) {
      e.printStackTrace();
     }
   }
}
