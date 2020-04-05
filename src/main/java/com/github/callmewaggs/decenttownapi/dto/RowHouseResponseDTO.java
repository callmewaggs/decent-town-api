package com.github.callmewaggs.decenttownapi.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class RowHouseResponseDTO {

  private static ObjectMapper objectMapper = new XmlMapper();

  public Header header;
  public Body body;

  public static RowHouseResponseDTO parseRowHouseResponseDTO(URL url) throws IOException {
    return objectMapper.readValue(url, RowHouseResponseDTO.class);
  }

  static class Header {

    public String resultCode;
    public String resultMsg;
  }

  static class Body {

    public List<Item> items;
    public String numOfRows;
    public String pageNo;
    public String totalCount;
  }

  static class Item {

    @JacksonXmlProperty(localName = "지역코드")
    public int regionalCode;

    @JacksonXmlProperty(localName = "법정동")
    public String dong;

    @JacksonXmlProperty(localName = "지번")
    public String jibun;

    @JacksonXmlProperty(localName = "연립다세대")
    public String houseName;

    @JacksonXmlProperty(localName = "층")
    public String floor;

    @JacksonXmlProperty(localName = "건축년도")
    public String buildYear;

    @JacksonXmlProperty(localName = "전용면적")
    public String area;

    @JacksonXmlProperty(localName = "년")
    public String dealYear;

    @JacksonXmlProperty(localName = "월")
    public String dealMonth;

    @JacksonXmlProperty(localName = "일")
    public String dealDay;

    @JacksonXmlProperty(localName = "보증금액")
    public String deposit;

    @JacksonXmlProperty(localName = "월세금액")
    public String monthlyRent;
  }
}
