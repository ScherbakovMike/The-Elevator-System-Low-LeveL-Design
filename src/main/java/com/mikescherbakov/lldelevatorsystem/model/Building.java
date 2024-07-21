package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Building {

  private final String id;
  private final Address address;
}
