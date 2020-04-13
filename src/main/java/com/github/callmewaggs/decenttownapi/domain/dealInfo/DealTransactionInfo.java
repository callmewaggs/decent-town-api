package com.github.callmewaggs.decenttownapi.domain.dealInfo;

import java.time.LocalDate;

public class DealTransactionInfo extends DealInfo {

  private int dealAmount;

  public DealTransactionInfo(LocalDate dealDate, int dealAmount) {
    super(dealDate);
    this.dealAmount = dealAmount;
  }

  public int getDealAmount() {
    return dealAmount;
  }
}
