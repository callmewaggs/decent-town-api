package com.github.callmewaggs.decenttownapi.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ApiExplorer {

  static final String SERVICE_KEY =
      "kFAbmsQtktR1bGKiwv%2F4WlEjtRK0cOzmtuqV3xklR8HsTqIIOCBEj8ZtASp70sopBwaIm6CP15XukuBvut%2FoqQ%3D%3D";

  public static void sendUrlRequest() throws IOException {
    StringBuilder urlBuilder =
        new StringBuilder(
            "http://openapi.molit.go.kr:8081/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcRHRent"); /*URL*/
    urlBuilder.append("?");
    urlBuilder.append(URLEncoder.encode("LAWD_CD", StandardCharsets.UTF_8) + "=");
    urlBuilder.append(URLEncoder.encode("11110", StandardCharsets.UTF_8)); /*각 지역별 코드*/
    urlBuilder.append("&");
    urlBuilder.append(URLEncoder.encode("DEAL_YMD", StandardCharsets.UTF_8) + "=");
    urlBuilder.append(URLEncoder.encode("201512", StandardCharsets.UTF_8)); /*월 단위 신고자료*/
    urlBuilder.append("&");
    urlBuilder.append(URLEncoder.encode("serviceKey", StandardCharsets.UTF_8) + "=");
    urlBuilder.append(SERVICE_KEY); /*Service Key*/
    URL url = new URL(urlBuilder.toString());
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
