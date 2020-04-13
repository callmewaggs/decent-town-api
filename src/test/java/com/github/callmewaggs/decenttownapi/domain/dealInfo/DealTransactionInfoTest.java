package com.github.callmewaggs.decenttownapi.domain.dealInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DealTransactionInfoTest {

  @DisplayName("DealTransactionInfo는 거래일과 거래금액에 대한 정보를 제공한다.")
  @Test
  public void provide_deal_date_and_deal_amount() {
    // Arrange
    LocalDate dealDate = LocalDate.of(2020, 12, 12);
    int dealAmount = 10000;

    // Act
    DealTransactionInfo dealTransactionInfo = new DealTransactionInfo(dealDate, dealAmount);

    // Assert
    assertEquals(dealDate, dealTransactionInfo.getDealDate());
    assertEquals(dealAmount, dealTransactionInfo.getDealAmount());
  }
}
