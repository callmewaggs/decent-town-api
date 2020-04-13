package com.github.callmewaggs.decenttownapi.domain.dealInfo;

import java.time.LocalDate;

public class DealInfo {

  private LocalDate dealDate;

  public DealInfo(LocalDate dealDate) {
    this.dealDate = dealDate;
  }

  public LocalDate getDealDate() {
    return this.dealDate;
  }
}
