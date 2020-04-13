package com.github.callmewaggs.decenttownapi.domain.dealInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DealRentInfoTest {

  @DisplayName("DealRentInfo는 거래일과 보증금, 월세에 대한 정보를 제공한다.")
  @Test
  public void provide_deal_date_and_deposit_and_monthly_rent() {
    // Arrange
    LocalDate dealDate = LocalDate.of(2020, 12, 12);
    int deposit = 1000;
    int monthlyRent = 35;

    // Act
    DealRentInfo dealRentInfo = new DealRentInfo(dealDate, deposit, monthlyRent);

    // Assert
    assertEquals(dealDate, dealRentInfo.getDealDate());
    assertEquals(deposit, dealRentInfo.getDeposit());
    assertEquals(monthlyRent, dealRentInfo.getMonthlyRent());
  }
}
