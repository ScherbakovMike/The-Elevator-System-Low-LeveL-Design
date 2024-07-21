package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;

@Getter
public class Passenger extends User {

  public Passenger(String id, String name, String birthDate) {
    super(id, name, birthDate);
  }
}
