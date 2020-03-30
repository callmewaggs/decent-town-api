package com.github.callmewaggs.decenttownapi.domain.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransactionItem extends Item {

  @Id
  private int id;

  @Column(name = "DEAL_AMOUNT", nullable = false)
  private int dealAmount;
}
