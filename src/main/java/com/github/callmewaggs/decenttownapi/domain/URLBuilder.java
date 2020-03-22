package com.github.callmewaggs.decenttownapi.domain;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLBuilder {

  private static final String URL_PATTERN = "http://openapi.molit.go.kr:8081/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcRHRent";
  private static final String REGION_CODE_PATTERN = "LAWD_CD";
  private static final String REPORT_YEAR_MONTH_PATTERN = "DEAL_YMD";
  private static final String SERVICE_KEY_PATTERN = "serviceKey";
  private static final String SERVICE_KEY =
      "kFAbmsQtktR1bGKiwv%2F4WlEjtRK0cOzmtuqV3xklR8HsTqIIOCBEj8ZtASp70sopBwaIm6CP15XukuBvut%2FoqQ%3D%3D";

  public static String build(String regionCode, String reportYearMonth) {
    StringBuilder urlBuilder =
        new StringBuilder(URL_PATTERN); /*URL*/
    urlBuilder.append("?");
    urlBuilder.append(URLEncoder.encode(REGION_CODE_PATTERN, StandardCharsets.UTF_8));
    urlBuilder.append("=");
    urlBuilder.append(URLEncoder.encode(regionCode, StandardCharsets.UTF_8)); /*각 지역별 코드*/
    urlBuilder.append("&");
    urlBuilder.append(URLEncoder.encode(REPORT_YEAR_MONTH_PATTERN, StandardCharsets.UTF_8));
    urlBuilder.append("=");
    urlBuilder.append(URLEncoder.encode(reportYearMonth, StandardCharsets.UTF_8)); /*월 단위 신고자료*/
    urlBuilder.append("&");
    urlBuilder.append(URLEncoder.encode(SERVICE_KEY_PATTERN, StandardCharsets.UTF_8));
    urlBuilder.append("=");
    urlBuilder.append(SERVICE_KEY); /*Service Key*/
    return urlBuilder.toString();
  }
}
