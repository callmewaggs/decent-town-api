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

public class RowHouseTransactionResponseDTOTest {

  @DisplayName("XML 파일로 부터 연립다세대 매매 DTO 를 파싱한다.")
  @Test
  public void parse_Row_House_Transaction_Response_DTO_from_XML_file() throws IOException {
    // Arrange
    InputStream inputStream = this.getClass()
        .getResourceAsStream("/Row_House_Transaction_Sample_Data.xml");
    ObjectMapper objectMapper = new XmlMapper();

    // Act
    RowHouseTransactionResponseDTO actual = objectMapper
        .readValue(inputStream, RowHouseTransactionResponseDTO.class);

    // Assert
    assertNotNull(actual);
  }

  @DisplayName("URL 로 부터 연립다세대 매매 DTO 를 파싱한다.")
  @Test
  public void parse_Row_House_Transaction_Response_DTO_from_URL() throws IOException {
    // Arrange
    URL url = URLBuilder.buildRowHouseTransactionURL(String.valueOf(11680), String.valueOf(201912));

    // Act
    RowHouseTransactionResponseDTO actual = RowHouseTransactionResponseDTO
        .parseRowHouseTransactionResponseDTO(url);

    // Assert
    assertNotNull(actual);
  }
}