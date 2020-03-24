package com.github.callmewaggs.decenttownapi.domain;

import java.time.LocalDate;

public class Item {

  private int buildYear;
  private int regionalCode;
  private String dong;
  private String jibun;
  private String apartmentName;
  private int floor;
  private double areaForExclusiveUse;
  private int deposit;
  private int monthlyRent;
  private LocalDate dealDate;

  public Item(
      int buildYear,
      int regionalCode,
      String dong,
      String jibun,
      String apartmentName,
      int floor,
      double areaForExclusiveUse,
      int deposit,
      int monthlyRent,
      LocalDate dealDate
  ) {
    this.buildYear = buildYear;
    this.regionalCode = regionalCode;
    this.dong = dong;
    this.jibun = jibun;
    this.apartmentName = apartmentName;
    this.floor = floor;
    this.areaForExclusiveUse = areaForExclusiveUse;
    this.deposit = deposit;
    this.monthlyRent = monthlyRent;
    this.dealDate = dealDate;
  }
}
