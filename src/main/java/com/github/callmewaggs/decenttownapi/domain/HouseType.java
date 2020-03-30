package com.github.callmewaggs.decenttownapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public enum HouseType {
  ROW_HOUSE(0, "연립다세대"),
  APARTMENT(1, "아파트"),
  EFFICIENCY_APARTMENT(2, "오피스텔");

  @Id
  private int id;

  @Column(name = "type", nullable = false)
  private String typeName;

  HouseType(int id, String typeName) {
    this.id = id;
    this.typeName = typeName;
  }
}
