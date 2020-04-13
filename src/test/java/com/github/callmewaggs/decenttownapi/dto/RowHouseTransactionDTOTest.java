package com.github.callmewaggs.decenttownapi.dto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.callmewaggs.decenttownapi.api.URLBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RowHouseTransactionDTOTest {

  @DisplayName("XML 파일로 부터 연립다세대 매매 DTO 를 파싱한다.")
  @Test
  public void parse_Row_House_Transaction_DTO_from_XML_file() throws IOException {
    // Arrange
    InputStream inputStream =
        this.getClass().getResourceAsStream("/Row_House_Transaction_Sample_Data.xml");
    ObjectMapper objectMapper = new XmlMapper();

    // Act
    RowHouseTransactionDTO actual =
        objectMapper.readValue(inputStream, RowHouseTransactionDTO.class);

    // Assert
    assertNotNull(actual);
  }

  @DisplayName("URL 로 부터 연립다세대 매매 DTO 를 파싱한다.")
  @Test
  public void parse_Row_House_Transaction_DTO_from_URL() throws IOException {
    // Arrange
    String regionalCode = String.valueOf(11680);
    String yyyy = String.valueOf(2019);
    String mm = String.valueOf(12);
    URL url = URLBuilder.buildRowHouseTransactionURL(regionalCode, yyyy + mm);

    // Act
    RowHouseTransactionDTO actual =
        RowHouseTransactionDTO.parseRowHouseTransactionResponseDTO(url);

    // Assert
    assertNotNull(actual);
  }

  @DisplayName("3년치 데이터를 파싱한다.")
  @Test
  public void parse_Row_House_Transaction_DTO_from_URL_for_three_years()
      throws IOException {
    String regionalCode = String.valueOf(11680);
    for (int year = 2016; year < 2020; ++year) {
      for (int month = 1; month < 13; ++month) {
        String yyyy = String.valueOf(year);
        String mm = month / 10 == 1 ? String.valueOf(month) : "0" + month;
        // Arrange
        URL url = URLBuilder.buildRowHouseTransactionURL(regionalCode, yyyy + mm);

        // Act
        RowHouseTransactionDTO actual =
            RowHouseTransactionDTO.parseRowHouseTransactionResponseDTO(url);

        // Assert
        assertNotNull(actual);
      }
    }
  }
}
