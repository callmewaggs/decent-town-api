package com.github.callmewaggs.decenttownapi.domain.dealInfo;

import java.time.LocalDate;

public class DealRentInfo extends DealInfo {

  private int deposit;
  private int monthlyRent;

  public DealRentInfo(LocalDate dealDate, int deposit, int monthlyRent) {
    super(dealDate);
    this.deposit = deposit;
    this.monthlyRent = monthlyRent;
  }

  public int getDeposit() {
    return this.deposit;
  }

  public int getMonthlyRent() {
    return this.monthlyRent;
  }
}
