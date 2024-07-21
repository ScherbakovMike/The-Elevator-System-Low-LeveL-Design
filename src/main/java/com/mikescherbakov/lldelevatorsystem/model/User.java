package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public abstract class User {

  private final String id;
  private final String name;
  private final String birthDate;
}
