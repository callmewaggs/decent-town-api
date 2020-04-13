package com.github.callmewaggs.decenttownapi.domain.dealInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DealInfoTest {

  @DisplayName("거래일을 제공한다.")
  @Test
  public void provide_deal_date() {
    // Arrange
    LocalDate dealDate = LocalDate.of(2015, 12, 4);
    DealInfo dealInfo = new DealInfo(dealDate);

    // Act
    LocalDate actual = dealInfo.getDealDate();

    // Assert
    LocalDate expected = LocalDate.of(2015, 12, 4);
    assertEquals(expected, actual);
  }
}
