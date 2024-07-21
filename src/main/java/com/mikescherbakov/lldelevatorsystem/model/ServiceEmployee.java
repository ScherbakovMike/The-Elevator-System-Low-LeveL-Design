package com.mikescherbakov.lldelevatorsystem.model;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class ServiceEmployee extends User {

  private final LocalDate hireDate;

  public ServiceEmployee(String id, String name, String birthDate, LocalDate hireDate) {
    super(id, name, birthDate);
    this.hireDate = hireDate;
  }
}
