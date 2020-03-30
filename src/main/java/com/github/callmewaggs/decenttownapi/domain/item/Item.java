package com.github.callmewaggs.decenttownapi.domain.item;

import com.github.callmewaggs.decenttownapi.domain.House;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

class Item {

  @Column(name = "HOUSE", nullable = false)
  private House house;

  @Column(name = "DEAL_DATE", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private java.util.Date dealDate;
}
