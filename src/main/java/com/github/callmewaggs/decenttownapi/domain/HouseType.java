package com.github.callmewaggs.decenttownapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOUSE_TYPE")
public enum HouseType {
  ROW_HOUSE(0, "연립다세대"),
  APARTMENT(1, "아파트"),
  EFFICIENCY_APARTMENT(2, "오피스텔");

  @Id
  @Column(name = "TYPE_ID", nullable = false)
  private int id;

  @Column(name = "TYPE_NAME", nullable = false)
  private String typeName;

  HouseType(int id, String typeName) {
    this.id = id;
    this.typeName = typeName;
  }
}
