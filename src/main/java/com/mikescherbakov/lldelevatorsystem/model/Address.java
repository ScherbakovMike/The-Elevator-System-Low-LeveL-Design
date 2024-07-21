package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Address {

  private final String id;
  private final String streetName;
  private final String buildingNumber;
}
