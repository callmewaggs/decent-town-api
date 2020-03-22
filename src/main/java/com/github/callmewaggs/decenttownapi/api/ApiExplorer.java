package com.github.callmewaggs.decenttownapi.api;

import com.github.callmewaggs.decenttownapi.domain.URLBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiExplorer {

  public static void sendUrlRequest() throws IOException {
    String urlPattern = URLBuilder.build("11110", "201512");
    URL url = new URL(urlPattern);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Content-type", "application/xml");
    System.out.println("Response code: " + conn.getResponseCode());
    BufferedReader rd;
    if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
      rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    StringBuilder sb = new StringBuilder();
    String line;
    while ((line = rd.readLine()) != null) {
      sb.append(line);
    }
    rd.close();
    conn.disconnect();
    System.out.println(sb.toString());
  }
}
