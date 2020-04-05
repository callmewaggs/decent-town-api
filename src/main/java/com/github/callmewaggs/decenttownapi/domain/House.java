package com.github.callmewaggs.decenttownapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOUSE")
public class House {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "HOUSE_ID", nullable = false)
  private long id;

  @ManyToOne
  @JoinColumn(name = "TYPE_ID")
  @Enumerated(EnumType.STRING)
  @Column(name = "HOUSE_TYPE", nullable = false)
  private HouseType houseType;

  @Column(name = "REGIONAL_CODE", nullable = false)
  private int regionalCode;

  @Column(name = "DONG", nullable = false)
  private String dong;

  @Column(name = "JIBUN", nullable = false)
  private String jibun;

  @Column(name = "HOUSE_NAME", nullable = false)
  private String houseName;

  @Column(name = "FLOOR", nullable = false)
  private int floor;

  @Column(name = "BUILD_YEAR", nullable = false)
  private int buildYear;

  @Column(name = "AREA", nullable = false)
  private double area;

  private House() {
  }

  public House(HouseType houseType, int regionalCode, String dong, String jibun,
      String houseName, int floor, int buildYear, double area) {
    this.houseType = houseType;
    this.regionalCode = regionalCode;
    this.dong = dong;
    this.jibun = jibun;
    this.houseName = houseName;
    this.floor = floor;
    this.buildYear = buildYear;
    this.area = area;
  }
}
