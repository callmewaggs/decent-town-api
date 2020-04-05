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

public class RowHouseResponseDTOTest {

  @DisplayName("XML 파일로 부터 연립다세대 DTO 를 파싱한다.")
  @Test
  public void parse_DTO_from_XML_file() throws IOException {
    // Arrange
    InputStream inputStream = this.getClass().getResourceAsStream("/RowHouseResponse200405.xml");
    ObjectMapper objectMapper = new XmlMapper();

    // Act
    RowHouseResponseDTO actual = objectMapper.readValue(inputStream, RowHouseResponseDTO.class);

    // Assert
    assertNotNull(actual);
  }

  @DisplayName("URL 로 부터 연립다세대 DTO 를 파싱한다.")
  @Test
  public void parse_DTO_from_URL() throws IOException {
    // Arrange
    URL url = URLBuilder.build(String.valueOf(11680), String.valueOf(201912));

    // Act
    RowHouseResponseDTO actual = RowHouseResponseDTO.parseRowHouseResponseDTO(url);

    // Assert
    assertNotNull(actual);
  }
}
