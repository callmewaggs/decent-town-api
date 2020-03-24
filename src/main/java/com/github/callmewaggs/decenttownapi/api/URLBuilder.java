package com.github.callmewaggs.decenttownapi.api;

public class URLBuilder {

  private static final String URL_PATTERN =
      "http://openapi.molit.go.kr:8081/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcRHRent";
  private static final String DISTRICT_CODE_PATTERN = "LAWD_CD";
  private static final String REPORT_YEAR_MONTH_PATTERN = "DEAL_YMD";
  private static final String SERVICE_KEY_PATTERN = "serviceKey";
  private static final String SERVICE_KEY =
      "kFAbmsQtktR1bGKiwv%2F4WlEjtRK0cOzmtuqV3xklR8HsTqIIOCBEj8ZtASp70sopBwaIm6CP15XukuBvut%2FoqQ%3D%3D";

  public static String build(String districtCode, String reportYearMonth) {
    StringBuilder urlBuilder = new StringBuilder(URL_PATTERN); /*URL*/
    urlBuilder.append("?");
    urlBuilder.append(DISTRICT_CODE_PATTERN);
    urlBuilder.append("=");
    urlBuilder.append(districtCode); /*각 지역별 코드*/
    urlBuilder.append("&");
    urlBuilder.append(REPORT_YEAR_MONTH_PATTERN);
    urlBuilder.append("=");
    urlBuilder.append(reportYearMonth); /*월 단위 신고자료*/
    urlBuilder.append("&");
    urlBuilder.append(SERVICE_KEY_PATTERN);
    urlBuilder.append("=");
    urlBuilder.append(SERVICE_KEY); /*Service Key*/
    return urlBuilder.toString();
  }
}
