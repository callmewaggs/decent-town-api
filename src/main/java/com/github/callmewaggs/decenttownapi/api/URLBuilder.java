package com.github.callmewaggs.decenttownapi.api;

import java.net.MalformedURLException;
import java.net.URL;

public class URLBuilder {

  private static final String ROW_HOUSE_RENT_END_POINT =
      "http://openapi.molit.go.kr:8081/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcRHRent";
  private static final String ROW_HOUSE_TRANSACTION_END_POINT =
      "http://openapi.molit.go.kr:8081/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcRHTrade";
  private static final String DISTRICT_CODE_PATTERN = "LAWD_CD";
  private static final String REPORT_YEAR_MONTH_PATTERN = "DEAL_YMD";
  private static final String SERVICE_KEY_PATTERN = "serviceKey";
  private static final String SERVICE_KEY =
      "kFAbmsQtktR1bGKiwv%2F4WlEjtRK0cOzmtuqV3xklR8HsTqIIOCBEj8ZtASp70sopBwaIm6CP15XukuBvut%2FoqQ%3D%3D";

  public static URL buildRowHouseRentURL(String districtCode, String reportYearMonth)
      throws MalformedURLException {
    return getUrl(ROW_HOUSE_RENT_END_POINT, districtCode, reportYearMonth);
  }

  public static URL buildRowHouseTransactionURL(String districtCode, String reportYearMonth)
      throws MalformedURLException {
    return getUrl(ROW_HOUSE_TRANSACTION_END_POINT, districtCode, reportYearMonth);
  }

  private static URL getUrl(String endPoint, String districtCode, String reportYearMonth)
      throws MalformedURLException {
    String url =
        endPoint
            + "?"
            + DISTRICT_CODE_PATTERN
            + "="
            + districtCode
            + "&"
            + REPORT_YEAR_MONTH_PATTERN
            + "="
            + reportYearMonth
            + "&"
            + SERVICE_KEY_PATTERN
            + "="
            + SERVICE_KEY;
    return new URL(url);
  }
}
