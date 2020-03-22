package com.github.callmewaggs.decenttownapi.api;

import com.github.callmewaggs.decenttownapi.domain.URLBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiExplorer {

  private static final int HTTP_STATUS_OK = 200;
  private static final int HTTP_STATUS_MULTIPLE_CHOICES = 300;

  public static void sendUrlRequest(int regionCode, int reportYearMonth) throws IOException {
    String urlPattern =
        URLBuilder.build(String.valueOf(regionCode), String.valueOf(reportYearMonth));
    URL url = new URL(urlPattern);
    String response = getUrlResponse(url);
  }

  private static String getUrlResponse(URL url) throws IOException {
    HttpURLConnection connection = getConnectionTo(url);
    System.out.println("Response code: " + connection.getResponseCode());
    BufferedReader rd = getResultToBuffer(connection);
    StringBuilder sb = getMessage(rd);
    rd.close();
    connection.disconnect();
    return sb.toString();
  }

  private static StringBuilder getMessage(BufferedReader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    String line;
    while ((line = rd.readLine()) != null) {
      sb.append(line);
    }
    return sb;
  }

  private static BufferedReader getResultToBuffer(HttpURLConnection connection) throws IOException {
    if (connection.getResponseCode() < HTTP_STATUS_OK
        || connection.getResponseCode() > HTTP_STATUS_MULTIPLE_CHOICES) {
      return new BufferedReader(new InputStreamReader(connection.getErrorStream()));
    }
    return new BufferedReader(new InputStreamReader(connection.getInputStream()));
  }

  private static HttpURLConnection getConnectionTo(URL url) throws IOException {
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.setRequestProperty("Content-type", "application/xml");
    return connection;
  }
}
