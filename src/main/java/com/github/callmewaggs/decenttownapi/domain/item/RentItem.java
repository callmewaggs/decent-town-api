package com.github.callmewaggs.decenttownapi.domain.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RentItem extends Item {

  @Id
  private int id;

  @Column(name = "DEPOSIT", nullable = false)
  private int deposit;

  @Column(name = "MONTHLY_RENT", nullable = false)
  private int monthlyRent;
}
